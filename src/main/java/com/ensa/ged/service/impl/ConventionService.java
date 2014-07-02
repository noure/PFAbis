package com.ensa.ged.service.impl;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.ged.dao.IConventionDao;
import com.ensa.ged.dao.common.IOperations;
import com.ensa.ged.model.Convention;
import com.ensa.ged.service.IConventionService;
import com.ensa.ged.service.common.AbstractService;

@Service
public class ConventionService extends AbstractService<Convention> implements IConventionService, Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
    private IConventionDao dao;

    public ConventionService() {
        super();
    }

    // API

    @Override
    protected IOperations<Convention> getDao() {
        return dao;
    }

	public void findByLogin(String login) {
		// TODO Auto-generated method stub
		
	}

}
