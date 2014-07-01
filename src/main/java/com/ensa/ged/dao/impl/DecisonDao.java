package com.ensa.ged.dao.impl;

import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.IDecisonDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.Decison;

@Repository
public class DecisonDao extends AbstractHibernateDao<Decison>
		implements IDecisonDao {

	public DecisonDao() {
		super();

		setClazz(Decison.class);
	}

	// API

}

