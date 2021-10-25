package com.gnaixeuy.monkeyMi.controller;

import com.gnaixeuy.monkeyMi.pojo.Admin;
import com.gnaixeuy.monkeyMi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 * <p>admin业务控制器</p>
 *
 * @author GnaixEuy
 * @date 2021/10/24
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
@Controller
@RequestMapping("/admin")
public class AdminAction {

	@Autowired
	AdminService adminService;

	@RequestMapping(value = {"login", "login.action"})
	public String login(HttpServletRequest request, String name, String pwd) {
		if (name == null || pwd == null) {
			return "/admin/login";
		}
		Admin admin = this.adminService.login(name, pwd);
		if (admin != null) {
			System.out.println("用户登入:" + admin.getaName() + "    " + admin.getaPass());
			request.getSession().setAttribute("admin", admin);
			return "/admin/main";
		} else {
			return "/admin/login";
		}
	}

	@RequestMapping(value = {"register", "register.action"})
	public String register() {
		//注册业务待补充
		return "/admin/register";
	}

}
