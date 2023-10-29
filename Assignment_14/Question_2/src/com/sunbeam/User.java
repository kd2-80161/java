package com.sunbeam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
	private int id;
	private String fname;
	private String lname;
	private String email;
	private String passwd;
	private Date dob;
	private short status;
	private String role;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public short getStatus() {
		return status;
	}
	public void setStatus(short status) {
		this.status = status;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User(int id, String fname, String lname, String email, String passwd, Date dob, short status, String role) {
		super();
		this.id = id;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.passwd = passwd;
		this.dob = dob;
		this.status = status;
		this.role = role;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		
		return "User [id=" + id + ", fname=" + fname + ", lname=" + lname + ", email=" + email + ", passwd=" + passwd
				+ ", dob=" + sdf.format(dob) + ", status=" + status + ", role=" + role + "]";
	}
}
