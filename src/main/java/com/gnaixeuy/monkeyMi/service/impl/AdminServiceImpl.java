package com.gnaixeuy.monkeyMi.service.impl;

import com.gnaixeuy.monkeyMi.entity.Admin;
import com.gnaixeuy.monkeyMi.mapper.AdminMapper;
import com.gnaixeuy.monkeyMi.pojo.AdminExample;
import com.gnaixeuy.monkeyMi.service.AdminService;
import com.gnaixeuy.monkeyMi.utils.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 * <p> 管理员模块业务接口 </p>
 *
 * @author GnaixEuy
 * @date 2021/10/24
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	private AdminMapper adminMapper;

	/**
	 * @param name 用户名
	 * @param pwd  用户密码
	 * @return loginState
	 */
	@Override
	public Admin login(String name, String pwd) {
		final AdminExample adminExample = new AdminExample();
		adminExample.createCriteria().andANameEqualTo(name);
		final List<Admin> admins = this.adminMapper.selectByExample(adminExample);
		if (admins.size() > 0) {
			final Admin admin = admins.get(0);
			final String miPwd = MD5Util.getMD5(pwd);
			if (miPwd != null && miPwd.equals(admin.getaPass())) {
				return admin;
			}
		}
		return null;
	}

	@Override
	public Admin login(Integer id) {
		System.out.println(this.adminMapper + "mapper被填充");
		final Admin admin = this.adminMapper.selectByPrimaryKey(id);
		System.out.println(admin.getaName());
		System.out.println(admin.getaPass());
		return admin;
	}

}
