package com.gnaixeuy.monkeyMi.controller;

import com.gnaixeuy.monkeyMi.pojo.Admin;
import com.gnaixeuy.monkeyMi.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String login(String name, String pwd) {
		System.out.println(name);
		if (name == null || pwd == null) {
			System.out.println(name+pwd+"重新登");
			return "/admin/login.html";
		}
		System.out.println("到这了");
		Admin admin = this.adminService.login(name,pwd);
		System.out.println("到这了2");
		if (admin != null) {
			System.out.println("登入成功");
			System.out.println(admin.getaName());
			System.out.println(admin.getaPass());
			return "/admin/mian.html";
		} else {
			System.out.println("到这了3");
			return "/admin/login.html";
		}
	}
}
