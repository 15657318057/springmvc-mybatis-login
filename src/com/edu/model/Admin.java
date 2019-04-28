package com.edu.model;

import java.io.Serializable;

public class Admin implements Serializable{
	private int id;
	private String name;
	private String password;
	private String status;
	private String sname;
	private String href;
	private String na;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getHref() {
		return href;
	}
	public void setHref(String href) {
		this.href = href;
	}
	public String getNa() {
		return na;
	}
	public void setNa(String na) {
		this.na = na;
	}
	

}
