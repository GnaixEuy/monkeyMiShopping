package com.gnaixeuy.monkeyMi.utils;

import java.util.UUID;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 * <br> 文件名生成工具类 </br>
 *
 * @author GnaixEuy
 * @date 2021/10/31
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */

@SuppressWarnings(value = {"all"})
public class FileNameUtil {
	/**
	 * 根据UUID生成文件名
	 *
	 * @return uuid
	 */
	public static String getUUIDFileName() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString().replace("-", "");
	}

	/**
	 * 从请求头中提取文件名和类型
	 *
	 * @param context 请求头信息
	 */

	public static String getRealFileName(String context) {
		// Content-Disposition: form-data; name="myFile"; filename="a_left.jpg"
		int index = context.lastIndexOf("=");
		return context.substring(index + 2, context.length() - 1);
	}

	/**
	 * 根据给定的文件名和后缀截取文件名
	 *
	 * @param fileName 给定的文件名
	 */
	public static String getFileType(String fileName) {
		//9527s.jpg
		int index = fileName.lastIndexOf(".");
		return fileName.substring(index);
	}
}
