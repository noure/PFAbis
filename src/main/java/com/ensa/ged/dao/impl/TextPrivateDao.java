package com.ensa.ged.dao.impl;

import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.ITextPrivateDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.TextPrivate;

@Repository
public class TextPrivateDao extends AbstractHibernateDao<TextPrivate>
		implements ITextPrivateDao {

	public TextPrivateDao() {
		super();

		setClazz(TextPrivate.class);
	}

	// API

}

