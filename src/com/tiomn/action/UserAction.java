package com.tiomn.action;

import java.util.List;

import com.tiomn.entity.User;
import com.tiomn.service.UserService;

public class UserAction {
	private List<User> list; 
	private int totalPages;
	private int page=1;

	UserService us = new UserService();
	
	public String execute(){
		try {
			list = us.findAll(page,2);
			totalPages=us.getTotalPages(2);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "success";
	}

	public List<User> getList() {
		return list;
	}

	public void setList(List<User> list) {
		this.list = list;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	
}
