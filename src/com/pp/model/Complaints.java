package com.pp.model;

public class Complaints {
	
	int p_id;
	int c_id;
	String c_title;
	String status;
	public Complaints() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Complaints(int p_id, int c_id, String c_title, String status) {
		super();
		this.p_id = p_id;
		this.c_id = c_id;
		this.c_title = c_title;
		this.status = status;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public int getC_id() {
		return c_id;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public String getC_title() {
		return c_title;
	}
	public void setC_title(String c_title) {
		this.c_title = c_title;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Complaints [p_id=" + p_id + ", c_id=" + c_id + ", c_title=" + c_title + ", status=" + status + "]";
	}
	
	
	

}
