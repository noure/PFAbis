package com.ensa.ged.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.ged.dao.ISousRepertoryDao;
import com.ensa.ged.dao.common.IOperations;
import com.ensa.ged.model.SousRepertory;
import com.ensa.ged.service.ISousRepertoryyService;
import com.ensa.ged.service.common.AbstractService;

@Service
public class SousRepertoryService extends AbstractService<SousRepertory> implements ISousRepertoryyService {

    @Autowired
    private ISousRepertoryDao dao;

    public SousRepertoryService() {
        super();
    }

    // API

    @Override
    protected IOperations<SousRepertory> getDao() {
        return dao;
    }

}
