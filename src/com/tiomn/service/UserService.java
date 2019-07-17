package com.tiomn.service;

import java.util.List;

import com.tiomn.dao.UserDAO;
import com.tiomn.dao.UserDAOImp;
import com.tiomn.entity.User;

public class UserService {
	UserDAO dao = new UserDAOImp();
	
	public List<User> findAll(int page,int pageSize) throws Exception{
		return dao.findAll(page,pageSize);
	}
	
	public int getTotalPages(int pageSize) throws Exception{
		return dao.getTotalPages(pageSize);
	}
}
