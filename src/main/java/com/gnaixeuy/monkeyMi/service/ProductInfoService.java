package com.gnaixeuy.monkeyMi.service;

import com.github.pagehelper.PageInfo;
import com.gnaixeuy.monkeyMi.entity.ProductInfo;

import java.util.List;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 * productInfo的服务接口
 * @author GnaixEuy
 * @date 2021/10/26
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
public interface ProductInfoService {

	List<ProductInfo> getAll();

	PageInfo<ProductInfo> splitPage(Integer pageNum, Integer pageSize);

}
