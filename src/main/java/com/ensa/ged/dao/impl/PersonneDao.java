package com.ensa.ged.dao.impl;

import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.IPersonneDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.Personne;

@Repository
public class PersonneDao extends AbstractHibernateDao<Personne>
		implements IPersonneDao {

	public PersonneDao() {
		super();

		setClazz(Personne.class);
	}

	// API

}

