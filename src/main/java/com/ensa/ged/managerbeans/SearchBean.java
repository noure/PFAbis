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


@Component("rechercheBean")
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
//	 List<MotCle> mots=new ArrayList<>();
//	 List<TextPrivate> txtprives=new ArrayList<>();
//	 List<TextPublic> txtpubls =new ArrayList<>();
	 List<Document> docs=new ArrayList<>();
	 
	 
	 public String rechercherParMot(){
		
		docs= motCleService.findByLibelle(motrechercher);
		
		 return "result";
		
	 }
	 public String rechercherParTxtPriv(){
		 
		 docs=privateService.findByLibelle( txtprivérechercher);
		return "result";
		 
		 
	 }
	public String rechercherParTxtPubl(){
		
		docs=publicService.findByLibelle(txtpublrechercher);
		return "result";
	}
	public String getMotrechercher() {
		return motrechercher;
	}
	public void setMotrechercher(String motrechercher) {
		this.motrechercher = motrechercher;
	}
	public String getTxtprivérechercher() {
		return txtprivérechercher;
	}
	public void setTxtprivérechercher(String txtprivérechercher) {
		this.txtprivérechercher = txtprivérechercher;
	}
	public String getTxtpublrechercher() {
		return txtpublrechercher;
	}
	public void setTxtpublrechercher(String txtpublrechercher) {
		this.txtpublrechercher = txtpublrechercher;
	}
	public List<Document> getDocs() {
		return docs;
	}
	public void setDocs(List<Document> docs) {
		this.docs = docs;
	}
	

}
