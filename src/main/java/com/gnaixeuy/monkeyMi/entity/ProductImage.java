package com.gnaixeuy.monkeyMi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 * <p> 商品图片实体类 </p>
 *
 * @author GnaixEuy
 * @date 2021/10/31
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ProductImage {

	private String imageUrl;

}
