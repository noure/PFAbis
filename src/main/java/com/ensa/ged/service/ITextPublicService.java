package com.ensa.ged.service;

import java.util.List;

import com.ensa.ged.dao.common.IOperations;
import com.ensa.ged.model.Document;
import com.ensa.ged.model.TextPublic;

public interface ITextPublicService extends IOperations<TextPublic> {

	List<Document> findByLibelle(String txtPubl);

}
