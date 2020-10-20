package com.pp.model;

import java.util.Arrays;

public class Customer {
	
	int p_id;
	String p_name;
	Complaints [] complaints;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int p_id, String p_name, Complaints[] complaints) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.complaints = complaints;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public Complaints[] getComplaints() {
		return complaints;
	}
	public void setComplaints(Complaints[] complaints) {
		this.complaints = complaints;
	}
	@Override
	public String toString() {
		return "Customer [p_id=" + p_id + ", p_name=" + p_name + ", complaints=" + Arrays.toString(complaints) + "]";
	}
	
	

}
