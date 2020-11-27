package com.example.REST.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class user_manager {
	
	@Id
	@GeneratedValue
	
	@Column(name="id")
	private int id;
	
	@Column(name="f_name")
	private String f_name;
	
	@Column(name="l_name")
	private String l_name;

	@Column(name="age")
	private int age;
	
	public user_manager() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getf_name() {
		return f_name;
	}

	public String getl_name() {
		return l_name;
	}

	public void setf_name(String f_name) {
		this.f_name = f_name;
	}

	public void setl_name(String l_name) {
		this.l_name = l_name;
	}

	public int getage() {
		return age;
	}

	public void setage(int age) {
		this.age = age;
	}
	
}
