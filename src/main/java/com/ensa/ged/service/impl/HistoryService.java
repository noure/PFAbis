package com.ensa.ged.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.ged.dao.IHistoryDao;
import com.ensa.ged.dao.common.IOperations;
import com.ensa.ged.model.History;
import com.ensa.ged.service.IHistoryService;
import com.ensa.ged.service.common.AbstractService;

@Service
public class HistoryService extends AbstractService<History> implements IHistoryService {

    @Autowired
    private IHistoryDao dao;

    public HistoryService() {
        super();
    }

    // API

    @Override
    protected IOperations<History> getDao() {
        return dao;
    }

}
