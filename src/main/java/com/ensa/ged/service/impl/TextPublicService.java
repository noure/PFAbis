package com.ensa.ged.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ensa.ged.dao.ITextPublicDao;
import com.ensa.ged.dao.common.IOperations;
import com.ensa.ged.model.Document;
import com.ensa.ged.model.TextPublic;
import com.ensa.ged.service.ITextPublicService;
import com.ensa.ged.service.common.AbstractService;

@Service
public class TextPublicService extends AbstractService<TextPublic> implements ITextPublicService {

    @Autowired
    private ITextPublicDao dao;

    public TextPublicService() {
        super();
    }

    // API

    @Override
    protected IOperations<TextPublic> getDao() {
        return dao;
    }

	@Override
	public List<Document> findByLibelle(String txtPubl) {
		return dao.findByLibelle(txtPubl);
	}

}
