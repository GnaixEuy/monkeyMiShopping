package com.gnaixeuy.monkeyMi.service;

import com.gnaixeuy.monkeyMi.entity.Admin;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 *
 * @author GnaixEuy
 * @date 2021/10/24
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
public interface AdminService {

	/**
	 *
	 * @return loginState
	 */
	Admin login(String name, String pwd);

	Admin login(Integer id);
}
