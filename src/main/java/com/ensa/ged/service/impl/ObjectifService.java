package com.ensa.ged.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.ged.dao.IObjectifDao;
import com.ensa.ged.dao.common.IOperations;
import com.ensa.ged.model.Objectif;
import com.ensa.ged.service.IObjectifService;
import com.ensa.ged.service.common.AbstractService;

@Service
public class ObjectifService extends AbstractService<Objectif> implements IObjectifService {

    @Autowired
    private IObjectifDao dao;

    public ObjectifService() {
        super();
    }

    // API

    @Override
    protected IOperations<Objectif> getDao() {
        return dao;
    }

	public void findByLogin(String login) {
		// TODO Auto-generated method stub
		
	}

}
