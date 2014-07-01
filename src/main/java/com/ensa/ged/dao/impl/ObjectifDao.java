package com.ensa.ged.dao.impl;

import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.IObjectifDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.Objectif;

@Repository
public class ObjectifDao extends AbstractHibernateDao<Objectif>
		implements IObjectifDao {

	public ObjectifDao() {
		super();

		setClazz(Objectif.class);
	}

	// API

}

