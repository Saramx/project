package com.mx.dao;

import java.util.List;
import java.util.Map;

import com.mx.entity.Users;

public interface UsersDao {
	/**
	 * ��½
	 * @param map
	 * @return
	 */
	Users login(Map<String, Object> map);
}
