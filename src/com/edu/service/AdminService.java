package com.edu.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.edu.model.Admin;

public interface AdminService {
	public Admin loginAdmin(String name,String password,HttpServletRequest request);
}
