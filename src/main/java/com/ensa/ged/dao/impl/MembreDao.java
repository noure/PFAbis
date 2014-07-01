package com.ensa.ged.dao.impl;

import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.IMembreDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.Membre;

@Repository
public class MembreDao extends AbstractHibernateDao<Membre> implements IMembreDao{
 
	public MembreDao() {
		super(); 

		setClazz(Membre.class);
	}
}
