package com.ensa.ged.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.ged.dao.IMotCleDao;
import com.ensa.ged.dao.common.IOperations;
import com.ensa.ged.model.MotCle;
import com.ensa.ged.service.IMotCleService;
import com.ensa.ged.service.common.AbstractService;

@Service
public class MotCleService extends AbstractService<MotCle> implements IMotCleService {

    @Autowired
    private IMotCleDao dao;

    public MotCleService() {
        super();
    }

    // API

    @Override
    protected IOperations<MotCle> getDao() {
        return dao;
    }

}
