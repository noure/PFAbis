package com.ensa.ged.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.ITextPrivateDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.Document;
import com.ensa.ged.model.TextPrivate;

@Repository
public class TextPrivateDao extends AbstractHibernateDao<TextPrivate>
		implements ITextPrivateDao {

	public TextPrivateDao() {
		super();

		setClazz(TextPrivate.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Document> findByLibelle(String mot) {
		return getCurrentSession().createQuery("select document from TextPrivate as m where m.libelle="+mot).list();
	}

	// API

}

