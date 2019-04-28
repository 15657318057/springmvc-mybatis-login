package com.edu.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.edu.model.Admin;
import com.edu.service.AdminService;
@Controller
@RequestMapping("/admin")
public class AdminController {
	@Resource(name="adminService")
	private AdminService service;
	
	@RequestMapping("/login")
	public String login(String name,String password,HttpServletRequest request) throws IllegalStateException,IOException
	{
		Admin admin = service.loginAdmin(name, password,request);
		System.out.println(admin);
		if (admin!=null) {
			return "welcome";
		}else {
			return "index";
		}
		
	}

}
