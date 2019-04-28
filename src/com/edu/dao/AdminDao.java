package com.edu.dao;

import org.apache.ibatis.annotations.Param;

import com.edu.model.Admin;

public interface AdminDao {
	public Admin login(@Param("name")String name,@Param("password")String password);
}
