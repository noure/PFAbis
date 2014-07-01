package com.ensa.ged.dao.impl;


import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.IDocumentDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.Document;

@Repository
public class DocumentDao extends AbstractHibernateDao<Document> implements IDocumentDao {

	public DocumentDao() {
		super(); 

		setClazz(Document.class);
	}

	// API

}
