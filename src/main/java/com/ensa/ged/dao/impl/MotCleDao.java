package com.ensa.ged.dao.impl;


import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.IMotCleDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.Document;
import com.ensa.ged.model.MotCle;

@Repository
public class MotCleDao extends AbstractHibernateDao<MotCle> implements IMotCleDao {
 

	public MotCleDao() {
		super();

		setClazz(MotCle.class);
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Document> findByLibelle(String mot) {
		 
		return getCurrentSession().createQuery("select document from MotCle as m where m.libelle="+mot).list();
	}

	// API

}
