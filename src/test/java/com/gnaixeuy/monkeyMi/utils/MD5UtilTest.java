package com.gnaixeuy.monkeyMi.utils;

import org.junit.jupiter.api.Test;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 * <p>MD5Util工具类的测试类</p>
 * @author GnaixEuy
 * @date 2021/10/24
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
public class MD5UtilTest {

	@Test
	public void testMD5Encryption(){
		String password = "000000";
		System.out.println("password = " + password);
		String encryptionPassword = MD5Util.getMD5(password);
		System.out.println("encryptionPassword = " + encryptionPassword);
	}


}
