package com.ensa.ged.managerbeans;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;
import org.primefaces.model.tagcloud.DefaultTagCloudItem;
import org.primefaces.model.tagcloud.DefaultTagCloudModel;
import org.primefaces.model.tagcloud.TagCloudModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.ensa.ged.dao.IGroupeDao;
import com.ensa.ged.model.Document;
import com.ensa.ged.model.Groupe;
import com.ensa.ged.model.MotCle;
import com.ensa.ged.model.Repertory;
import com.ensa.ged.model.TextPrivate;
import com.ensa.ged.model.TextPublic;
import com.ensa.ged.model.TypeDocument;
import com.ensa.ged.model.User;
import com.ensa.ged.service.IDocumentService;
import com.ensa.ged.service.IGroupeService;
import com.ensa.ged.service.IMotCleService;
import com.ensa.ged.service.IRepertoryService;
import com.ensa.ged.service.ITextPrivateService;
import com.ensa.ged.service.ITextPublicService;
import com.ensa.ged.service.ITypeDocumentService;
import com.ensa.ged.service.IUserService;

@Component("bOBean")
@Scope("session")
public class BOBean  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	transient IDocumentService docSer;
	@Autowired
	transient IMotCleService motCleService;
	@Autowired
	private IUserService userService;
	@Autowired
	transient IGroupeService groupeService;
	@Autowired
	transient IRepertoryService repService;
	@Autowired
	transient ITypeDocumentService typService;
	@Autowired
	transient ITextPrivateService privtxtService;
	@Autowired
	transient ITextPublicService pubtxtService;

	private String groupe;
	private String idDocument;
	private String repository;
	private String themeDoc;
	private Date dateEdition;
	private Date dateMiseAjour;
	private Date dateIncertion;
	private int tailleDoc = 0;
	private String commentaire = "";
	private String link = "";
	private Repertory rep;
	private TypeDocument typeBO;
	private Groupe gr = new Groupe();
	private String privTitle;
	private String txtpub;

	String libelle;
	Document doc;
	List<Document> documents;
	List<MotCle> mots = new ArrayList<>();
	List<TextPrivate> privTitles = new ArrayList<TextPrivate>();
	List<TextPublic> txtpubs = new ArrayList<>();

	public void ajouterGroupe() {
		gr.setNameGroupe(groupe);
		if (groupeService != null) {
			groupeService.create(gr);
		}

	}

	public void ajouterRepertoire() {
		rep = new Repertory();
		rep.setNameRepertory(repository);
		repService.create(rep);
	}

	public User retrouverUser(long id) {
		return userService.findOne(id);
	}

	public void ajouterTypeDocument() {// à commenter apres premier appelle
		typeBO = new TypeDocument();
		typeBO.setNameTypeDoc("Bulletin Officiel");
		typService.create(typeBO);
	}

	public void affecter() {

		doc.setCommentaire(commentaire);
		doc.setIdDocument(Integer.parseInt(idDocument));
		doc.setDateEdition(dateEdition);
		doc.setDateMiseAjour(dateMiseAjour);
		doc.setDateIncertion(dateIncertion);
		doc.setLink(link);
		doc.setThemeDoc(themeDoc);
		doc.setTailleDoc(tailleDoc);

	}

	@PostConstruct
	public void init() {
		System.out.println("retriving the documents from the DB");
		documents = docSer.findAll();
		doc = new Document();
	}

	/**
	 * prépare l'ajoute d'un nouveau utilisateur
	 */
	public String preparerAjoute() {

		doc = new Document();

		return "createBO";

	}

	public void ajouter() {
		doc = new Document();

		affecter();
		ajouterGroupe();
		ajouterRepertoire();
		ajouterTypeDocument(); //
		doc.setGroupe(gr);
		doc.setRepertory(rep);
		doc.setUser(retrouverUser(3));
		doc.setTypeDocument(typeBO);

		docSer.create(doc);
		mots = new ArrayList<>();
		privTitles = new ArrayList<TextPrivate>();
		 txtpubs = new ArrayList<>();

	}

	public void ajouterMot() {
		//doSomething();
		
		MotCle mot = new MotCle();
		mot.setLibelle(libelle);
		mot.setDocument(doc);
		motCleService.create(mot);
				System.out.println("::::Ajoute mot cle ::::");
		mots.add(mot);
		libelle="";
		FacesContext fc = FacesContext.getCurrentInstance();  
        fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Le mot a été ajouter ", null));
		

	}

	public String getPrivTitle() {
		return privTitle;
	}

	public void setPrivTitle(String privTitle) {
		this.privTitle = privTitle;
	}

	public void ajouterPrivTitleAuList() {

		TextPrivate txtpr = new TextPrivate();
		txtpr.setTitreTextPriv(privTitle);
		txtpr.setDocument(doc);
		privtxtService.create(txtpr);
		privTitles.add(txtpr);
		FacesContext fc = FacesContext.getCurrentInstance();  
        fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Le titre de text privé a été ajouter ", null));

	}

	public void ajouterTitrePubAuList() {
		TextPublic txp = new TextPublic();
		txp.setTitreTexPub(txtpub);
		txp.setDocument(doc);
		pubtxtService.create(txp);
		System.out.println("::::ajoute de titre public:::::");
		txtpubs.add(txp);
		FacesContext fc = FacesContext.getCurrentInstance();  
        fc.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Le titre publique a été ajouter ", null));

	}

	public List<TextPrivate> getPrivTitles() {
		return privTitles;
	}

	public void setPrivTitles(List<TextPrivate> privTitles) {
		this.privTitles = privTitles;
	}

	public String preparerMiseAjour(long userId) {

		doc = docSer.findOne(userId);
		mots = new ArrayList<>();
		privTitles = new ArrayList<TextPrivate>();
		 txtpubs = new ArrayList<>();
		 for(MotCle mt: doc.getMotCles()){
			 mots.add(mt);
		 }
		 for(TextPublic tb: doc.getTextPublics()){
			 txtpubs.add(tb);
		 }
		 
		 for(TextPrivate tp: doc.getTextPrivates()){
			 privTitles.add(tp);
		 }
		 
		 commentaire= doc.getCommentaire();
		 idDocument=""+doc.getIdDocument();
		 dateEdition=doc.getDateEdition();
		 dateMiseAjour=doc.getDateMiseAjour();
		 dateIncertion=doc.getDateIncertion();
		 link=doc.getLink();
		 themeDoc=doc.getThemeDoc();
		 tailleDoc=doc.getTailleDoc();
		 groupe=doc.getGroupe().getNameGroupe();
		 repository=doc.getRepertory().getNameRepertory();
		
		 
		
		return "editBO";
	}

	public String modifier() {

		docSer.update(doc);

		init();
		doc = new Document();
		return "listBO";
	}

	public String preparerSuppression(long docId) {
		System.out.println("preparersupprimer " +docId);
		doc = docSer.findOne(docId);
		return "deleteBO";
	}

	public String supprimer() {
		
		docSer.delete(doc);

		init();
		doc = new Document();
		return "listBO";
	}

	public String retour() {

		init();
		return "listBO";
	}

	public Document getDoc() {
		return doc;
	}

	public void setDoc(Document doc) {
		this.doc = doc;
	}

	public List<Document> getDocuments() {
		return documents;
	}

	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}

	public List<MotCle> getMots() {
		return mots;
	}

	public void setMots(List<MotCle> mots) {
		this.mots = mots;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getGroupe() {
		return groupe;
	}

	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}

	public String getIdDocument() {
		return idDocument;
	}

	public void setIdDocument(String idDocument) {
		this.idDocument = idDocument;
	}

	public String getRepository() {
		return repository;
	}

	public void setRepository(String repository) {
		this.repository = repository;
	}

	public String getThemeDoc() {
		return themeDoc;
	}

	public void setThemeDoc(String themeDoc) {
		this.themeDoc = themeDoc;
	}

	public Date getDateEdition() {
		return dateEdition;
	}

	public void setDateEdition(Date dateEdition) {
		this.dateEdition = dateEdition;
	}

	public Date getDateMiseAjour() {
		return dateMiseAjour;
	}

	public void setDateMiseAjour(Date dateMiseAjour) {
		this.dateMiseAjour = dateMiseAjour;
	}

	public Date getDateIncertion() {
		return dateIncertion;
	}

	public void setDateIncertion(Date dateIncertion) {
		this.dateIncertion = dateIncertion;
	}

	public int getTailleDoc() {
		return tailleDoc;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public void setTailleDoc(int tailleDoc) {
		this.tailleDoc = tailleDoc;
	}

	public String getTxtpub() {
		return txtpub;
	}

	public void setTxtpub(String txtpub) {
		this.txtpub = txtpub;
	}

	public List<TextPublic> getTxtpubs() {
		return txtpubs;
	}

	public void setTxtpubs(List<TextPublic> txtpubs) {
		this.txtpubs = txtpubs;
	}

	public void doSomething() {
		try {
			// simulate a long running request
			Thread.sleep(1500);
		} catch (Exception e) {
			// ignore
		}
	}
}
