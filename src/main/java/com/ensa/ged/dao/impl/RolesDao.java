package com.ensa.ged.dao.impl;

import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.IRolesDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.Roles;

@Repository
public class RolesDao extends AbstractHibernateDao<Roles> implements
		IRolesDao {

	public RolesDao() {
		super();

		setClazz(Roles.class);
	}

	// API

}
