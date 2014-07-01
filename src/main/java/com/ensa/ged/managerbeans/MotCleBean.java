package com.ensa.ged.managerbeans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import com.ensa.ged.model.MotCle;
import com.ensa.ged.service.IMotCleService;

public class MotCleBean implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	private String libelle;
			

	@Autowired
	transient IMotCleService motCleService;
	
	public void ajouterMotCle(){
		 MotCle mot;
		// motCleService.create(mot);
		
		
	}

}
