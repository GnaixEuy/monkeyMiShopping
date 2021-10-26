package com.gnaixeuy.monkeyMi.service.impl;

import com.gnaixeuy.monkeyMi.mapper.ProductInfoMapper;
import com.gnaixeuy.monkeyMi.pojo.ProductInfo;
import com.gnaixeuy.monkeyMi.pojo.ProductInfoExample;
import com.gnaixeuy.monkeyMi.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 * <p> ProductInfo接口的实现类 </p>
 * @author GnaixEuy
 * @date 2021/10/26
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

	@Autowired
	private ProductInfoMapper productInfoMapper;

	@Override
	public List<ProductInfo> getAll() {
		return this.productInfoMapper.selectByExample(new ProductInfoExample());
	}

}