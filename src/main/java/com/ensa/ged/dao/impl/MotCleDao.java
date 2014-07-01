package com.ensa.ged.dao.impl;


import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.IMotCleDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.MotCle;

@Repository
public class MotCleDao extends AbstractHibernateDao<MotCle> implements IMotCleDao {

	public MotCleDao() {
		super();

		setClazz(MotCle.class);
	}

	// API

}
