package com.ensa.ged.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.ged.dao.ITextPrivateDao;
import com.ensa.ged.dao.common.IOperations;
import com.ensa.ged.model.Document;
import com.ensa.ged.model.TextPrivate;
import com.ensa.ged.service.ITextPrivateService;
import com.ensa.ged.service.common.AbstractService;

@Service
public class TextPrivateService extends AbstractService<TextPrivate> implements ITextPrivateService {

    @Autowired
    private ITextPrivateDao dao;

    public TextPrivateService() {
        super();
    }

    // API

    @Override
    protected IOperations<TextPrivate> getDao() {
        return dao;
    }

	@Override
	public List<Document> findByLibelle(String mot) {
		return dao.findByLibelle(mot) ;
		
	}

}
