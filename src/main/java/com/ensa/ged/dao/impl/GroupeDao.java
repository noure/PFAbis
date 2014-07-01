package com.ensa.ged.dao.impl;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import com.ensa.ged.dao.IGroupeDao;
import com.ensa.ged.dao.common.AbstractHibernateDao;
import com.ensa.ged.model.Groupe;

@Repository

public class GroupeDao extends AbstractHibernateDao<Groupe> implements IGroupeDao {

	public GroupeDao() {
		super();

		setClazz(Groupe.class);
	}
}