package com.mx.service;

import java.util.List;

import com.mx.entity.Users;

public interface UsersService {

	/**
	 * ��½
	 * 
	 * @param map
	 * @return
	 */
	boolean login(String name, String passWord);
}
