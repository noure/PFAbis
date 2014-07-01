package com.ensa.ged.dao.impl;

import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.IRepertoryDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.Repertory;

@Repository
public class RepertoryDao extends AbstractHibernateDao<Repertory> implements
		IRepertoryDao {

	public RepertoryDao() {
		super();

		setClazz(Repertory.class);
	}

	// API

}
