/*package com.leo.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leo.springboot.properties.LeoProperties;


//该组合注解相当于@Controller和@ResponseBody
@RestController
public class HelloWorldController {
	//方法一
	@Autowired
	private Environment environment;
	
	//方法二
	@Value("${com.leo.name}")
	private String name1;
	@Value("${com.leo.sex}")
	private String sex1;
	@Value("${com.leo.age}")
	private int age1;
	
	//方法三
	@Autowired
	private LeoProperties leoProperties;
	
	@RequestMapping("/test")
	public String printHello() {
		System.out.println("com.leo.name="+environment.getProperty("com.leo.name"));
		System.out.println("com.leo.sex="+environment.getProperty("com.leo.sex"));
		System.out.println("com.leo.age="+environment.getProperty("com.leo.age"));
		System.out.println("------------------------------");
		System.out.println("name1:"+name1);
		System.out.println("sex1:"+sex1);
		System.out.println("age1:"+age1);
		System.out.println("------------------------------");
		System.out.println("leoProperties.getName():"+leoProperties.getName());
		System.out.println("leoProperties.getSex():"+leoProperties.getSex());
		System.out.println("leoProperties.getAge():"+leoProperties.getAge());
		return "Hello World";
	}
}
*/