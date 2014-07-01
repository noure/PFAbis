package com.ensa.ged.dao.impl;

import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.IConventionDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.Convention;

@Repository
public class ConventionDao extends AbstractHibernateDao<Convention>
		implements IConventionDao {

	public ConventionDao() {
		super();

		setClazz(Convention.class);
	}

	// API

}

