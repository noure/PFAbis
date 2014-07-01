package com.ensa.ged.dao.impl;

import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.IHistoryDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.History;

@Repository
public class HistoryDao extends AbstractHibernateDao<History> implements
		IHistoryDao {

	public HistoryDao() {
		super();

		setClazz(History.class);
	}

	// API

}
