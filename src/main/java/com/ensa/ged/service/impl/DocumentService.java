package com.ensa.ged.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.ged.dao.IDocumentDao;
import com.ensa.ged.dao.common.IOperations;
import com.ensa.ged.model.Document;
import com.ensa.ged.service.IDocumentService;
import com.ensa.ged.service.common.AbstractService;

@Service
public class DocumentService extends AbstractService<Document> implements IDocumentService {

    @Autowired
    private IDocumentDao dao;

    public DocumentService() {
        super();
    }

    // API

    @Override
    protected IOperations<Document> getDao() {
        return dao;
    }

}
