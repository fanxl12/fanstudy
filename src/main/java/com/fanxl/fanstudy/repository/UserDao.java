/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.fanxl.fanstudy.repository;

import java.util.List;

import com.fanxl.fanstudy.entity.User;

/**
 * 通过@MapperScannerConfigurer扫描目录中的所有接口, 动态在Spring Context中生成实现.
 * 方法名称必须与Mapper.xml中保持一致.
 * 
 * @author calvin
 */
@MyBatisRepository
public interface UserDao {
	
	User findByLoginName(String loginName);
	
	List<User> findAll();
	
	User findOne(long id);
	
    void save(User user);
	
	void update(User user);

	void delete(Long id);
	
	void updatePw(User user);
	
	void updateHead(User user);
	
	void updateName(User user);
	
	void updateSex(User user);
	
	void updateAge(User user);
	
	void updatePhoneNumber(User user);
	
	void updateAddress(User user);
	
	void updateDeviceTokens(User user);
	
}
