package com.gnaixeuy.monkeymi.controller;

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


	@RequestMapping(value = "/toError")
	public String toErro(){
		return "/admin/err.html";
	}

	@RequestMapping(value = "/addproduct")
	public String index(){
		return "/admin/addproduct.html";
	}

}
