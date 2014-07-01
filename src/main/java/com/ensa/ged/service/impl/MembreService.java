package com.ensa.ged.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.ged.dao.IMembreDao;
import com.ensa.ged.dao.common.IOperations;
import com.ensa.ged.model.Membre;
import com.ensa.ged.service.IMembreService;
import com.ensa.ged.service.common.AbstractService;

@Service
public class MembreService extends AbstractService<Membre> implements IMembreService {

    @Autowired
    private IMembreDao dao;

    public MembreService() {
        super();
    }

    // API

    @Override
    protected IOperations<Membre> getDao() {
        return dao;
    }

	public void findByLogin(String login) {
		// TODO Auto-generated method stub
		
	}

}
