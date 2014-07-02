package com.ensa.ged.managerbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.ensa.ged.model.Document;
import com.ensa.ged.model.MotCle;
import com.ensa.ged.model.TextPrivate;
import com.ensa.ged.model.TextPublic;
import com.ensa.ged.service.IMotCleService;
import com.ensa.ged.service.ITextPrivateService;
import com.ensa.ged.service.ITextPublicService;


@Component
@Scope("session")
public class SearchBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 @Autowired
	 IMotCleService motCleService;
	 @Autowired
	 ITextPrivateService privateService;
	 @Autowired
	 ITextPublicService publicService;
	 
	 String motrechercher;
	 String txtprivérechercher;
	 String txtpublrechercher;
	 List<MotCle> mots=new ArrayList<>();
	 List<TextPrivate> txtprives=new ArrayList<>();
	 List<TextPublic> txtpubls =new ArrayList<>();
	 List<Document> docs=new ArrayList<>();
	 
	 
	 public String rechercherParMot(String mot){
		
		docs= motCleService.findByLibelle(mot);
		
		 return "result";
		
	 }
	 public String rechercherParTxtPriv(String txtpriv){
		 
		 docs=privateService.findByLibelle( txtpriv);
		return "result";
		 
		 
	 }
	public String rechercherParTxtPubl(String txtPubl){
		
		docs=publicService.findByLibelle(txtPubl);
		return "result";
	}
	

}
