package com.mx.entity;

import java.io.Serializable;

/**
 * 用户表
 */
public class Users implements Serializable {

	//序列化唯一标识符
	private static final long serialVersionUID = 1L;
	private Integer id;
	//用户名称
	private String name;
	//用户密码
	private String passWord;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
