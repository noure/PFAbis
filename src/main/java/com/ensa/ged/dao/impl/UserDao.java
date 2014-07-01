package com.ensa.ged.dao.impl;

import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.IUserDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.User;

@Repository
public class UserDao extends AbstractHibernateDao<User>
		implements IUserDao {

	public UserDao() {
		super();

		setClazz(User.class);
	}

	// API

}

