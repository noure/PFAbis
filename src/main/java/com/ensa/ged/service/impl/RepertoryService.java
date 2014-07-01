package com.ensa.ged.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.ged.dao.IRepertoryDao;
import com.ensa.ged.dao.common.IOperations;
import com.ensa.ged.model.Repertory;
import com.ensa.ged.service.IRepertoryService;
import com.ensa.ged.service.common.AbstractService;

@Service
public class RepertoryService extends AbstractService<Repertory> implements IRepertoryService {

    @Autowired
    private IRepertoryDao dao;

    public RepertoryService() {
        super();
    }

    // API

    @Override
    protected IOperations<Repertory> getDao() {
        return dao;
    }

}
