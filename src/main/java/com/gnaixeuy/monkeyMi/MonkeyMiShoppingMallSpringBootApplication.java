package com.gnaixeuy.monkeyMi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com/gnaixeuy/monkeyMi/mapper")
public class MonkeyMiShoppingMallSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonkeyMiShoppingMallSpringBootApplication.class, args);
	}

}
