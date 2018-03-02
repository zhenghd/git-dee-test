package com.leo.springboot.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.leo.springboot.pojo.User;

@Mapper
public interface UserMapper {
	//使用Mybatis的注解方式操作
	@Select("select * from tb_user where user_name like '%${name}%'")
	public List<User> queryUserByName(@Param("name")String name);
	
	//使用UserMapper映射文件
	public List<User> queryUsers();
}
