package com.gnaixeuy.monkeyMi.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.pagehelper.PageInfo;
import com.gnaixeuy.monkeyMi.entity.ProductImage;
import com.gnaixeuy.monkeyMi.entity.ProductInfo;
import com.gnaixeuy.monkeyMi.service.ProductInfoService;
import com.gnaixeuy.monkeyMi.utils.FileNameUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Objects;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 *
 * @author GnaixEuy
 * @date 2021/10/26
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
@Controller
@RequestMapping(value = {"/prod"})
public class ProductInfoAction {

	/**
	 * 每个商品页面默认展示的商品条数
	 */
	private static final int PAGE_SHOW_SIZE = 5;

	@Autowired
	private ProductInfoService productInfoService;

	@RequestMapping(value = "/getAll")
	public String getAll(HttpSession session) {
		final List<ProductInfo> all = this.productInfoService.getAll();
		System.out.println(all.size());
		session.setAttribute("list", all);
		return "/admin/product";
	}

	@RequestMapping(value = "/splitPage")
	public String splitPage(HttpSession session) {
		final PageInfo<ProductInfo> productInfoPageInfo = this.productInfoService.splitPage(1, ProductInfoAction.PAGE_SHOW_SIZE);
		session.setAttribute("info", productInfoPageInfo);
		return "/admin/product";
	}

	/**
	 * ajax分页function
	 */
	@ResponseBody
	@RequestMapping(value = {"/ajaxSplit", "/ajaxSplit.action"}, method = RequestMethod.POST)
	public void ajaxSplit(int page, HttpSession session) {
		final PageInfo<ProductInfo> productInfoPageInfo = this.productInfoService.splitPage(page, ProductInfoAction.PAGE_SHOW_SIZE);
		session.setAttribute("info", productInfoPageInfo);
	}

	/**
	 * 异步ajax文件上传处理
	 */
	@ResponseBody
	@RequestMapping(value = {"/ajaxImg.action"})
	public Object ajaxImg(MultipartFile pImage, HttpServletRequest request) {

		//提取UUID + 上传土坯对后缀.jpeg
		final String saveFileName = FileNameUtil.getUUIDFileName() + FileNameUtil.getFileType(Objects.requireNonNull(pImage.getOriginalFilename()));
		//得到项目中图片存储对路径
		final String outPath = System.getProperty("user.dir")+"/target/classes/static/image_big";
//		final String realPath = System.getProperty("user.dir")+"/src/main/resources/static/image_big";
		//转存
		final String imageOutPath = outPath + File.separator + saveFileName;
//		final String imagePath = realPath + File.separator + saveFileName;
		try {
			pImage.transferTo(new File(imageOutPath));
//			pImage.transferTo(new File(imagePath));
			System.out.println(imageOutPath);

			final String imageUrl = new ObjectMapper().writeValueAsString(new ProductImage(saveFileName));
			System.out.println(imageUrl);
			return imageUrl;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

}
