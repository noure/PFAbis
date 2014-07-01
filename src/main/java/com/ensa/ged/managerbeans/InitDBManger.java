package com.ensa.ged.managerbeans;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.ensa.ged.dao.IDocumentDao;
import com.ensa.ged.dao.IGroupeDao;
import com.ensa.ged.dao.IHistoryDao;
import com.ensa.ged.dao.IMotCleDao;
import com.ensa.ged.dao.IRepertoryDao;
import com.ensa.ged.dao.IRolesDao;
import com.ensa.ged.dao.ISousRepertoryDao;
import com.ensa.ged.dao.ITextPrivateDao;
import com.ensa.ged.dao.ITextPublicDao;
import com.ensa.ged.dao.ITypeDocumentDao;
import com.ensa.ged.dao.IUserDao;
import com.ensa.ged.dao.impl.TypeDocumentDao;
import com.ensa.ged.model.Document;
import com.ensa.ged.model.Groupe;
import com.ensa.ged.model.History;
import com.ensa.ged.model.MotCle;
import com.ensa.ged.model.Repertory;
import com.ensa.ged.model.Roles;
import com.ensa.ged.model.TextPrivate;
import com.ensa.ged.model.TextPublic;
import com.ensa.ged.model.TypeDocument;
import com.ensa.ged.model.User;

public class InitDBManger implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 787L;

//	@Autowired
//	IDocumentDao documentDaos;
//	
//	@Autowired
//	ITypeDocumentDao documentTypeDao;
//	
//	@Autowired
//	IGroupeDao groupeDao;
//	
//	@Autowired
//	IHistoryDao historyDao;
//	
//	@Autowired
//	IMotCleDao motCleDao;
//	
//	@Autowired
//	IRepertoryDao repertoryDao;
//	
//	@Autowired
//	IRolesDao rolesDao;
//	
//	@Autowired
//	ISousRepertoryDao repertoryyDao;
//	
//	@Autowired
//	ITextPrivateDao textPrivateDao;
//	
//	@Autowired
//	ITextPublicDao textPublicDao;
//	
//	@Autowired
//	IUserDao userDao;
//	@Autowired
//	ITypeDocumentDao typeDocumentDao;
//	
//	@PostConstruct
//	public void initDB(){
//		System.out.println("Enregistre les données au DB");
//		Roles roleUser =new Roles();
//		roleUser.setName("ROLE_USER"); 
//		rolesDao.create(roleUser);
//		
//		Roles roleAdmin =new Roles();
//		roleAdmin.setName("ROLE_ADMIN");
//		rolesDao.create(roleAdmin);
//		
//		User userAdmin= new User();
//		  userAdmin.setUserName("Admin");
//		  userAdmin.setCniUser("PB134890");
//		  userAdmin.setEmailUser("labihi.nour");
//		  userAdmin.setPwdUser("123456");
//		  userAdmin.setProfessionUser("developper");
//		  userAdmin.setNationUser("marocain");
//		  Set<Roles> AdminRoles = new HashSet<Roles>();
//		  AdminRoles.add(roleAdmin);
//		  AdminRoles.add(roleUser);
//		  userAdmin.setRoleses(AdminRoles);
//		  userDao.create(userAdmin);	  
//		  Set<User> users = new HashSet<User>();
//		  users.add(userAdmin);
//		  roleUser.setUsers(users);
//		  roleAdmin.setUsers(users);
//		  rolesDao.update(roleAdmin);
//		  rolesDao.update(roleUser);
//		  
//		  
//		  
//		  TextPublic textPublic1=new TextPublic();
//		  textPublic1.setTitreTexPub("titre d'un text public ici");
//		  textPublicDao.create(textPublic1);
//		  
//		  TextPublic textPublic2=new TextPublic();
//		  textPublic2.setTitreTexPub("titre d'un text public ici");
//		  textPublicDao.create(textPublic2);
//		  
//		  
//		  TextPrivate textPrivate=new TextPrivate();
//		  textPrivate.setTitreTextPriv("titre d'un text privé ici ");
//		  textPrivateDao.create(textPrivate);
//		  
//		  TextPrivate textPrivate2=new TextPrivate();
//		  textPrivate2.setTitreTextPriv("titre d'un text privé ici ");
//		  textPrivateDao.create(textPrivate2);
//		  
//		  MotCle motCle1=new MotCle();
//		  motCle1.setLibelle("un_mot_clé1");
//		  motCleDao.create(motCle1);
//		  
//		  
//		  MotCle motCle2=new MotCle();
//		  motCle2.setLibelle("un_mot_clé2");
//		  motCleDao.create(motCle2);
//
//		  History history1=new History();
//		  history1.setDateHistory( new Date());
//		  historyDao.create(history1);
//		  
//		  History history2=new History();
//		  history2.setDateHistory( new Date());
//		  historyDao.create(history2);
//		  
//		  Groupe group=new Groupe();
//		  group.setNameGroupe("Premier Groupe");
//		  groupeDao.create(group);
//		  
//		  
//		  Repertory repertoire=new Repertory();
//		  repertoire.setDateCreation(new Date());
//		  repertoire.setDateUpdate(new Date());
//		  repertoire.setNameRepertory("C/users/user1/fichier"); 
//		 repertoryDao.create(repertoire);
//		  
//		  
//		  Document document = new Document();
//		  
//		  Set<History> histoires= new HashSet<History>();
//		  histoires.add(history2);
//		  histoires.add(history1);
//		  
//		  Set<TextPublic> textPublics =new HashSet<>();
//		  textPublics.add(textPublic1);
//		  textPublics.add(textPublic2);
//		  
//		  Set<TextPrivate> textPrivates =new HashSet<>();
//		  textPrivates.add(textPrivate);
//		  textPrivates.add(textPrivate2);
//		  
//		  Set<MotCle> mots = new HashSet<>();
//		  mots.add(motCle1);
//		  mots.add(motCle2);
//		  
//		  document.setTailleDoc(42);
//		  document.setGroupe(group);
//		  document.setRepertory(repertoire);
//		  document.setHistories(histoires);
//		  document.setMotCles(mots);
//		  document.setTextPrivates(textPrivates);
//		  document.setTextPublics(textPublics);
//		  document.setThemeDoc("bulletin officiel");
//		  Set<Document> documents = new HashSet<>();
//		  documents.add(document);
//		  userAdmin.setDocuments(documents);
//		  userDao.update(userAdmin);
//		  
//		  TypeDocument typeDocument= new TypeDocument();
//		  typeDocument.setNameTypeDoc("un type");
//		  typeDocument.setDocuments(documents);
//			typeDocumentDao.create(typeDocument);
//		
//		
//	}
}
