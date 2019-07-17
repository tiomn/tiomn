package com.tiomn.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import com.tiomn.entity.User;
import com.tiomn.util.DBUtil;

public class UserDAOImp implements UserDAO {

	public List<User> findAll(int page,int pageSize) throws Exception {
		Connection con = DBUtil.getConnection();
		List<User> list = new ArrayList<User>();
		String sql = "select * from user limit ?,?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, (page-1)*pageSize);
		ps.setInt(2, pageSize);
		ResultSet rs = ps.executeQuery();
		User u = null;
		SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		while(rs.next()){
			u = new User();
			u.setId(rs.getInt("id"));
			u.setUsername(rs.getString("username"));
			u.setEmail(rs.getString("email"));
			
			u.setRdate(f.format(rs.getTimestamp("registdate")));
			
			u.setRegistdate(rs.getTimestamp("registdate"));
			list.add(u);
		}
		DBUtil.close(con);
		return list;
	}

	public int getTotalPages(int pageSize) throws Exception {
		Connection con = DBUtil.getConnection();
		String sql = "select count(*) from user";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		rs.next();
		int rows = rs.getInt(1);
		DBUtil.close(con);
		if(rows%pageSize==0){
			return rows/pageSize;
		}else{
			return rows/pageSize+1;
		}
	}

}
