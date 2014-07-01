package com.ensa.ged.dao.impl;

import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.ITypeDocumentDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.TypeDocument;

@Repository
public class TypeDocumentDao extends AbstractHibernateDao<TypeDocument>
		implements ITypeDocumentDao {

	public TypeDocumentDao() {
		super();

		setClazz(TypeDocument.class);
	}

	// API

}

