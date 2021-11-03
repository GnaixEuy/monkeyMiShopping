package com.gnaixeuy.monkeyMi.listener;

import com.gnaixeuy.monkeyMi.entity.ProductType;
import com.gnaixeuy.monkeyMi.service.ProductTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.List;

/**
 * <img src="http://blog.GnaixEuy.cn/wp-content/uploads/2021/08/bug.jpeg"/>
 * 商品类别监听器，监听启动时间直接将商品类别放入application作用域中，后期直接获取
 * @author GnaixEuy
 * @date 2021/10/31
 * @see <a href='https://github.com/GnaixEuy'> GnaixEuy的GitHub </a>
 */
@Component
//@WebListener
public class ProductTypeListener implements ServletContextListener {

	@Autowired
	private ProductTypeService productTypeService;

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		final List<ProductType> allProductType = this.productTypeService.getAll();
		sce.getServletContext().setAttribute("ptList",allProductType);
	}


	@Override
	public void contextDestroyed(ServletContextEvent sce) {

	}
}
