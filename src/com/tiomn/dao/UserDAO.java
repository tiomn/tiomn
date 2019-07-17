package com.tiomn.dao;

import java.util.List;

import com.tiomn.entity.User;

public interface UserDAO {
	//查询所有会员
	public List<User> findAll(int page,int pageSize)throws Exception;
	
	//获取总页数
	public int getTotalPages(int pageSize)throws Exception;
	
	//
	
}
