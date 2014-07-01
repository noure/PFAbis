package com.ensa.ged.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.ged.dao.IGroupeDao;
import com.ensa.ged.dao.common.IOperations;
import com.ensa.ged.model.Groupe;
import com.ensa.ged.service.IGroupeService;
import com.ensa.ged.service.common.AbstractService;

@Service("groupeService")
public class GroupeService extends AbstractService<Groupe> implements IGroupeService {

    @Autowired
    private IGroupeDao dao;

    public GroupeService() {
        super();
    }

    // API

    @Override
    protected IOperations<Groupe> getDao() {
        return dao;
    }

}
