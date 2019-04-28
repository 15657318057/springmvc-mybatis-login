package com.edu.service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.edu.dao.AdminDao;
import com.edu.model.Admin;
@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService{
	@Resource(name="adminDao")
	private AdminDao dao;
		
	@Transactional(propagation=Propagation.SUPPORTS,readOnly=true)
	@Override
	public Admin loginAdmin(String name, String password,HttpServletRequest request) {
		HttpSession session = request.getSession();
		Admin admin = dao.login(name, password);
		System.out.println(admin);
		session.setAttribute("admin", admin);
		return admin;
	}

}
