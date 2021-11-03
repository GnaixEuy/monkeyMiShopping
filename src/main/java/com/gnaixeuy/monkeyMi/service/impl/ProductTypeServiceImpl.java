package com.gnaixeuy.monkeyMi.service.impl;

import com.gnaixeuy.monkeyMi.entity.ProductType;
import com.gnaixeuy.monkeyMi.mapper.ProductTypeMapper;
import com.gnaixeuy.monkeyMi.pojo.ProductTypeExample;
import com.gnaixeuy.monkeyMi.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 * <p>商品类型实现类</p>
 * @author GnaixEuy
 * @date 2021/10/30
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
@Service
public class ProductTypeServiceImpl implements ProductTypeService {

	@Autowired
	private ProductTypeMapper productTypeMapper;

	@Override
	public List<ProductType> getAll() {
		return this.productTypeMapper.selectByExample(new ProductTypeExample());
	}
}
