package com.ensa.ged.dao.impl;

import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.ISousRepertoryDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.SousRepertory;

@Repository
public class SousRepertoryDao extends AbstractHibernateDao<SousRepertory>
		implements ISousRepertoryDao {

	public SousRepertoryDao() {
		super();

		setClazz(SousRepertory.class);
	}

	// API

}
