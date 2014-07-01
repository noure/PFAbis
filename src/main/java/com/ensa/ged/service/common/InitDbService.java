package com.ensa.ged.service.common;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ensa.ged.dao.IDocumentDao;
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
import com.ensa.ged.dao.*;


@Service
@Transactional
//@ComponentScan("com.ensa.ged.dao.impl")
public class InitDbService {
	@Autowired
	IDocumentDao documentDaos;
	
	@Autowired
	ITypeDocumentDao documentTypeDao;
	
	@Autowired
	IGroupeDao groupeDao;
	
	@Autowired
	IHistoryDao historyDao;
	
	@Autowired
	IMotCleDao motCleDao;
	
	@Autowired
	IRepertoryDao repertoryDao;
	
	@Autowired
	IRolesDao rolesDao;
	
	@Autowired
	ISousRepertoryDao repertoryyDao;
	
	@Autowired
	ITextPrivateDao textPrivateDao;
	
	@Autowired
	ITextPublicDao textPublicDao;
	
	@Autowired
	IUserDao userDao;

	
	
	//@PostConstruct
	public void init(){
		
		Roles roleUser =new Roles();
		roleUser.setName("ROLE_USER"); 
		rolesDao.create(roleUser);
		
		Roles roleAdmin =new Roles();
		roleAdmin.setName("ROLE_ADMIN");
		rolesDao.create(roleAdmin);
		
		User userAdmin= new User();
		  userAdmin.setUserName("Admin");
		  userAdmin.setCniUser("PB134890");
		  userAdmin.setEmailUser("labihi.nour");
		  userAdmin.setPwdUser("123456");
		  userAdmin.setProfessionUser("developper");
		  userAdmin.setNationUser("marocain");
		  Set<Roles> AdminRoles = new HashSet<Roles>();
		  AdminRoles.add(roleAdmin);
		  AdminRoles.add(roleAdmin);
		  userAdmin.setRoles(AdminRoles);
		  
		  Set<User> users = new HashSet<User>();
		  users.add(userAdmin);
		  roleUser.setUserlist(users);
		  roleAdmin.setUserlist(users);
		  
		  
		  TextPublic textPublic1=new TextPublic();
		  textPublic1.setTitreTexPub("titre d'un text public ici");
		  
		  TextPublic textPublic2=new TextPublic();
		  textPublic2.setTitreTexPub("titre d'un text public ici");
		  
		  TextPrivate textPrivate=new TextPrivate();
		  textPrivate.setTitreTextPriv("titre d'un text privé ici ");
		  
		  TextPrivate textPrivate2=new TextPrivate();
		  textPrivate2.setTitreTextPriv("titre d'un text privé ici ");
		  
		  MotCle motCle1=new MotCle();
		  motCle1.setLibelle("un_mot_clé1");
		  
		  MotCle motCle2=new MotCle();
		  motCle2.setLibelle("un_mot_clé2");

		  History history1=new History();
		  history1.setDateHistory( new Date());
		  
		  History history2=new History();
		  history2.setDateHistory( new Date());
		  
		  
		  Groupe group=new Groupe();
		  group.setNameGroupe("Premier Groupe");
		  
		  Repertory repertoire=new Repertory();
		  repertoire.setDateCreation(new Date());
		  repertoire.setDateUpdate(new Date());
		  repertoire.setNameRepertory("C/users/user1/fichier"); 
		 
		  
		  
		  Document document = new Document();
		  
		  Set<History> histoires= new HashSet<History>();
		  histoires.add(history2);
		  histoires.add(history1);
		  
		  Set<TextPublic> textPublics =new HashSet<>();
		  textPublics.add(textPublic1);
		  textPublics.add(textPublic2);
		  
		  Set<TextPrivate> textPrivates =new HashSet<>();
		  textPrivates.add(textPrivate);
		  textPrivates.add(textPrivate2);
		  
		  Set<MotCle> mots = new HashSet<>();
		  mots.add(motCle1);
		  mots.add(motCle2);
		  
		  document.setTailleDoc(42);
		  document.setGroupe(group);
		  document.setRepertory(repertoire);
		  document.setHistories(histoires);
		  document.setMotCles(mots);
		  document.setTextPrivates(textPrivates);
		  document.setTextPublics(textPublics);
		  document.setThemeDoc("bulletin officiel");
		  Set<Document> documents = new HashSet<>();
		  documents.add(document);
		  
		  
		  TypeDocument typeDocument= new TypeDocument();
		  typeDocument.setNameTypeDoc("un type");
		  typeDocument.setDocuments(documents);
		  
		  
		  
		  
	}
	

}
