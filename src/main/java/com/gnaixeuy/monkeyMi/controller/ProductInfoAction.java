package com.gnaixeuy.monkeyMi.controller;

import com.github.pagehelper.PageInfo;
import com.gnaixeuy.monkeyMi.pojo.ProductInfo;
import com.gnaixeuy.monkeyMi.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.List;

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
	 *
	 */
	@ResponseBody
	@RequestMapping(value = {"/ajaxSplit","/ajaxSplit.action"}, method = RequestMethod.POST )
	public void ajaxSplit(int page,HttpSession session){
		final PageInfo<ProductInfo> productInfoPageInfo = this.productInfoService.splitPage(page, ProductInfoAction.PAGE_SHOW_SIZE);
		session.setAttribute("info",productInfoPageInfo);
	}

}
