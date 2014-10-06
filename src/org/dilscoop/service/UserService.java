package org.dilscoop.service;

import org.dilscoop.dao.UserDao;
import org.dilscoop.model.UserDetails;

public class UserService {

	public void saveUser(UserDetails user){
		UserDao userDao = new UserDao();
		userDao.saveUser(user);
		
	}
}
