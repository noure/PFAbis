package com.ensa.ged.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.ITextPublicDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.Document;
import com.ensa.ged.model.TextPublic;

@Repository
public class TextPublicDao extends AbstractHibernateDao<TextPublic>
		implements ITextPublicDao {

	public TextPublicDao() {
		super();

		setClazz(TextPublic.class);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Document> findByLibelle(String txtPubl) {
		return getCurrentSession().createQuery("select document from TextPublic as m where m.libelle="+txtPubl).list();
	}
	// API

}

