package com.gnaixeuy.monkeyMi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 * 页面跳转action
 * @author GnaixEuy
 * @date 2021/10/25
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
@Controller
public class PageJumpAction {

	@RequestMapping("Terror")
	public String error(){
		return "/admin/error";
	}

	@RequestMapping(value = {"to_product.html"})
	public String toProduct(){return "/admin/product";}

	@RequestMapping(value = {"to_addProduct.html"})
	public String toAddProduct(){
		return "/admin/addProduct";
	}

}
