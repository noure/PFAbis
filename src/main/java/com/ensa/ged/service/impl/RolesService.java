package com.ensa.ged.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.ged.dao.IRolesDao;
import com.ensa.ged.dao.common.IOperations;
import com.ensa.ged.model.Roles;
import com.ensa.ged.service.IRolesService;
import com.ensa.ged.service.common.AbstractService;

@Service
public class RolesService extends AbstractService<Roles> implements IRolesService {

    @Autowired
    private IRolesDao dao;

    public RolesService() {
        super();
    }

    // API

    @Override
    protected IOperations<Roles> getDao() {
        return dao;
    }

}
