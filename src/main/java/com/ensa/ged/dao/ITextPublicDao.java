package com.ensa.ged.dao;

import java.util.List;

import com.ensa.ged.dao.common.IOperations;
import com.ensa.ged.model.Document;
import com.ensa.ged.model.TextPublic;

public interface ITextPublicDao extends IOperations<TextPublic> {

	List<Document> findByLibelle(String txtPubl);

}
