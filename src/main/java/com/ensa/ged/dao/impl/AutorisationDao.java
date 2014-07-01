package com.ensa.ged.dao.impl;

import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.IAutorisationDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.Autorisation;

@Repository
public class AutorisationDao extends AbstractHibernateDao<Autorisation>
		implements IAutorisationDao {

	public AutorisationDao() {
		super();

		setClazz(Autorisation.class);
	}

	// API

}

