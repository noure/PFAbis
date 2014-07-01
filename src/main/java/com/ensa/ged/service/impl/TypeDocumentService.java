package com.ensa.ged.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.ged.dao.ITypeDocumentDao;
import com.ensa.ged.dao.common.IOperations;
import com.ensa.ged.model.TypeDocument;
import com.ensa.ged.service.ITypeDocumentService;
import com.ensa.ged.service.common.AbstractService;

@Service
public class TypeDocumentService extends AbstractService<TypeDocument> implements ITypeDocumentService {

    @Autowired
    private ITypeDocumentDao dao;

    public TypeDocumentService() {
        super();
    }

    // API

    @Override
    protected IOperations<TypeDocument> getDao() {
        return dao;
    }

}
