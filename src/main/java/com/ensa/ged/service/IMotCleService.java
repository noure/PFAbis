package com.ensa.ged.service;

import java.util.List;

import com.ensa.ged.dao.common.IOperations;
import com.ensa.ged.model.Document;
import com.ensa.ged.model.MotCle;

public interface IMotCleService extends IOperations<MotCle>{

	List<Document> findByLibelle(String mot);

}
