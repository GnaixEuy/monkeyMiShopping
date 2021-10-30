package com.gnaixeuy.monkeyMi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * jsp文件迁移thymeleaf，该controller调试页面是否正常
 *
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 *
 * @author GnaixEuy
 * @date 2021/10/21
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
@Controller
public class TestPageResource {

	@RequestMapping(value = "/test_err.html")
	public String toError() {
		return "error";
	}

	@RequestMapping(value = "/test_addProduct.html")
	public String toIndex() {
		return "/admin/addproduct";
	}

	@RequestMapping(value = "/test_main.html")
	public String toMain() {
		return "/admin/main";
	}

	@RequestMapping(value = "/test_login.html")
	public String toLogin() {
		return "/admin/login";
	}

	@RequestMapping(value = "/test_register.html")
	public String toRegist() {
		return "/admin/register";
	}

	@RequestMapping(value = "/test_update.html")
	public String toUpdate() {
		return "/admin/update";
	}

	@RequestMapping(value = "/test_product.html")
	public String toProduct(){return "/admin/product";}
}
