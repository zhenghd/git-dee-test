package com.leo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.leo.springboot.properties.LeoProperties;

//@SpringBootApplication默认根据入口类的所在位置扫描包以及入口类所在位置以及子包范围
@SpringBootApplication
//@EnableConfigurationProperties(LeoProperties.class)
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
