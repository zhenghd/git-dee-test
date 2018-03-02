package com.leo.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ConfigurationProperties 获取application.properties文件中配置项值
 * prefix表示配置项前缀
 * ignoreUnknownFields表示是否忽略在文件中但是本类又没有属性对应的情况
 */
//@ConfigurationProperties(prefix="com.leo",ignoreInvalidFields=true)
public class LeoProperties {
	private String name;
	private String sex;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
