package com.gnaixeuy.monkeyMi.controller;

import com.gnaixeuy.monkeyMi.pojo.ProductInfo;
import com.gnaixeuy.monkeyMi.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
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

	@Autowired
	private ProductInfoService productInfoService;

	@RequestMapping(value = "/getAll")
	public String getAll(HttpServletRequest httpServletRequest){

		final List<ProductInfo> all = this.productInfoService.getAll();
		System.out.println(all.size());
		httpServletRequest.setAttribute("list", all);
		return "/admin/product";
	}
}
