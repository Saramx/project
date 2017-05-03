package com.mx.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.dao.UsersDao;
import com.mx.entity.Users;
import com.mx.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	private UsersDao usersDao;

	// µÇÂ½
	public boolean login(String name, String passWord) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("name", name);
		map.put("passWord", passWord);
		Users users = usersDao.login(map);
		if (users == null) {
			return false;
		} else {
			return true;
		}

	}

}
