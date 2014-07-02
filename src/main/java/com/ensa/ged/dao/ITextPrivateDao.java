package com.ensa.ged.dao;

import java.util.List;

import com.ensa.ged.dao.common.IOperations;
import com.ensa.ged.model.Document;
import com.ensa.ged.model.TextPrivate;

public interface ITextPrivateDao extends IOperations<TextPrivate> {

	List<Document> findByLibelle(String mot);

}
