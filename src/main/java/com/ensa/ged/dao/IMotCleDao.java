package com.ensa.ged.dao;

import java.util.List;

import com.ensa.ged.dao.common.IOperations;
import com.ensa.ged.model.Document;
import com.ensa.ged.model.MotCle;

public interface IMotCleDao extends IOperations<MotCle> {
	
	List<Document> findByLibelle(String mot);

}
