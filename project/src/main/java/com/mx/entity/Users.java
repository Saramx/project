package com.mx.entity;

import java.io.Serializable;

/**
 * �û���
 */
public class Users implements Serializable {

	//���л�Ψһ��ʶ��
	private static final long serialVersionUID = 1L;
	private Integer id;
	//�û�����
	private String name;
	//�û�����
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
