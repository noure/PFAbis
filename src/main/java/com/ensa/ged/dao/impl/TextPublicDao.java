package com.ensa.ged.dao.impl;

import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.ITextPublicDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.TextPublic;

@Repository
public class TextPublicDao extends AbstractHibernateDao<TextPublic>
		implements ITextPublicDao {

	public TextPublicDao() {
		super();

		setClazz(TextPublic.class);
	}

	// API

}

