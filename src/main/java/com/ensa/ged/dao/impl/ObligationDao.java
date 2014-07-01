package com.ensa.ged.dao.impl;

import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.IObligationDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.Obligation;

@Repository
public class ObligationDao extends AbstractHibernateDao<Obligation>
		implements IObligationDao {

	public ObligationDao() {
		super();

		setClazz(Obligation.class);
	}

	// API

}

