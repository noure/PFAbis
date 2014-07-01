package com.ensa.ged.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.ged.dao.IObligationDao;
import com.ensa.ged.dao.common.IOperations;
import com.ensa.ged.model.Obligation;
import com.ensa.ged.service.IObligationService;
import com.ensa.ged.service.common.AbstractService;

@Service
public class ObligationService extends AbstractService<Obligation> implements IObligationService {

    @Autowired
    private IObligationDao dao;

    public ObligationService() {
        super();
    }

    // API

    @Override
    protected IOperations<Obligation> getDao() {
        return dao;
    }

	public void findByLogin(String login) {
		// TODO Auto-generated method stub
		
	}

}
