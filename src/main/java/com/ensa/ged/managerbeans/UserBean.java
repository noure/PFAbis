package com.ensa.ged.managerbeans;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

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
import com.ensa.ged.service.IUserService;

@Component
@Scope("session")
public class UserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private IUserService userService;
	
	private String userName;
	private String emailUser;
	private String cniUser;
	private String nationUser;
	private String professionUser;
	private String pwdUser;
	private String pwdUserVerfi;

	User user;
	List<User> users;
	List<User> filterUsers;


	public void affecter() {

		user.setCniUser(getCniUser());
		user.setUserName(getUserName());
		user.setEmailUser(getEmailUser());
		user.setNationUser(getNationUser());
		user.setProfessionUser(getProfessionUser());
		user.setPwdUser(getPwdUser());

	}
	
	public void setup() {

	setCniUser("");
	setUserName("");
	setEmailUser("");
	setNationUser("");
	setProfessionUser("");
	setPwdUser("");
	setPwdUserVerfi("");

	}

	public void show() {

		System.out.println("SHOWWWW " + getUserName() + "   ::" + emailUser
				+ "::" + cniUser + "::" + nationUser + "::" + "::"
				+ professionUser + "::" + pwdUser);
	}

	/**
	 * cette methode est appeler au moment de construction de bean pour
	 * récupérer les données de la base
	 */
	@PostConstruct
	public void init() {
		users = userService.findAll();
		user = new User();
	}

	/**
	 * prépare l'ajoute d'un nouveau utilisateur
	 */
	public String preparerAjoute() {

		user = new User();
		return "creatUser";

	}

	public String ajouter() {
		this.affecter();
		userService.create(user);

		init();
		setup();
		return "listUsers";

	}

	public String preparerMiseAjour(long userId) {

		user = userService.findOne(userId);
		return "editUser";
	}

	public String modifier() {

		userService.update(user);

		init();
		setup();
		return "listUsers";
	}

	public String preparerSuppression(long userId) {
		user = userService.findOne(userId);
		return "deletUser";
	}

	public String supprimer() {
		userService.delete(user);

		init();
		setup();
		return "listUsers";
	}

	public String retour() {

		init();
		return "listUsers";
	}

	/**
	 * 
	 * getter et setter
	 */
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the emailUser
	 */
	public String getEmailUser() {
		return emailUser;
	}

	/**
	 * @param emailUser
	 *            the emailUser to set
	 */
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	/**
	 * @return the cniUser
	 */
	public String getCniUser() {
		return cniUser;
	}

	/**
	 * @param cniUser
	 *            the cniUser to set
	 */
	public void setCniUser(String cniUser) {
		this.cniUser = cniUser;
	}

	/**
	 * @return the nationUser
	 */
	public String getNationUser() {
		return nationUser;
	}

	/**
	 * @param nationUser
	 *            the nationUser to set
	 */
	public void setNationUser(String nationUser) {
		this.nationUser = nationUser;
	}

	/**
	 * @return the professionUser
	 */
	public String getProfessionUser() {
		return professionUser;
	}

	/**
	 * @param professionUser
	 *            the professionUser to set
	 */
	public void setProfessionUser(String professionUser) {
		this.professionUser = professionUser;
	}

	/**
	 * @return the pwdUser
	 */
	public String getPwdUser() {
		return pwdUser;
	}

	/**
	 * @param pwdUser
	 *            the pwdUser to set
	 */
	public void setPwdUser(String pwdUser) {
		this.pwdUser = pwdUser;
	}

	public List<User> getFilterUsers() {
		return filterUsers;
	}

	public void setFilterUsers(List<User> filterUsers) {
		this.filterUsers = filterUsers;
	}

	public UserBean() {
		super();
	}

	public String getPwdUserVerfi() {
		return pwdUserVerfi;
	}

	public void setPwdUserVerfi(String pwdUserVerfi) {
		this.pwdUserVerfi = pwdUserVerfi;
	}

}
