package com.gnaixeuy.monkeyMi.controller;

import com.gnaixeuy.monkeyMi.pojo.Admin;
import com.gnaixeuy.monkeyMi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
		final HttpSession session = request.getSession();
		if (name == null || pwd == null || "".equals(name.strip()) || "".equals(pwd.strip())) {
			session.setAttribute("errMsg", "请输入完整用户名和密码");
			return "/admin/login";
		}
		Admin admin = this.adminService.login(name, pwd);
		if (admin != null) {
			session.setAttribute("admin", admin);
			return "/admin/main";
		} else {
			session.setAttribute("errMsg", "用户名或密码不正确");
			return "/admin/login";
		}
	}

	@RequestMapping(value = {"register", "register.action"})
	public String register() {
		//注册业务待补充
		return "/admin/register";
	}

}
