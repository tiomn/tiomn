package com.tiomn.dao;

import java.util.List;

import com.tiomn.entity.User;

public interface UserDAO {
	//��ѯ���л�Ա
	public List<User> findAll(int page,int pageSize)throws Exception;
	
	//��ȡ��ҳ��
	public int getTotalPages(int pageSize)throws Exception;
	
	//
	
}
