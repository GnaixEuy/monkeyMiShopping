package com.gnaixeuy.monkeyMi;

import com.github.pagehelper.PageInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;

/**
 * @author gnaixeuy
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan("com.gnaixeuy.monkeyMi.mapper")
public class MonkeyMiShoppingMallSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonkeyMiShoppingMallSpringBootApplication.class, args);
	}

	@Bean(name = "pageHelper")
	public PageInterceptor pageHelper() {
		return new PageInterceptor();
	}

}


