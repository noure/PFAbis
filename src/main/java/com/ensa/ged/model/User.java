package com.ensa.ged.model;

// Generated Jun 18, 2014 11:36:08 PM by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "User", catalog = "GED_DB2")
public class User implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long userId;
	private boolean enabled;
	private String cniUser;
	private String emailUser;
	private String nationUser;
	private String professionUser;
	private String pwdUser;
	private String userName;
	private Set<Roles> roleses = new HashSet<Roles>(0);
	private Set<Document> documents = new HashSet<Document>(0);

	public User() {
	}

	public User(long userId, boolean enabled) {
		this.userId = userId;
		this.enabled = enabled;
	}

	public User(long userId, boolean enabled, String cniUser, String emailUser,
			String nationUser, String professionUser, String pwdUser,
			String userName, Set<Roles> roleses, Set<Document> documents) {
		this.userId = userId;
		this.enabled = enabled;
		this.cniUser = cniUser;
		this.emailUser = emailUser;
		this.nationUser = nationUser;
		this.professionUser = professionUser;
		this.pwdUser = pwdUser;
		this.userName = userName;
		this.roleses = roleses;
		this.documents = documents;
	}

	@Id
	@GenericGenerator(name="incr" , strategy="increment")
	@GeneratedValue(generator="incr")
	@Column(name = "userID", unique = true, nullable = false)
	public long getUserId() {
		return this.userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Column(name = "enabled", nullable = false)
	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Column(name = "cniUser", length = 254)
	public String getCniUser() {
		return this.cniUser;
	}

	public void setCniUser(String cniUser) {
		this.cniUser = cniUser;
	}

	@Column(name = "emailUser", length = 20)
	public String getEmailUser() {
		return this.emailUser;
	}

	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}

	@Column(name = "nationUser", length = 254)
	public String getNationUser() {
		return this.nationUser;
	}

	public void setNationUser(String nationUser) {
		this.nationUser = nationUser;
	}

	@Column(name = "professionUser", length = 254)
	public String getProfessionUser() {
		return this.professionUser;
	}

	public void setProfessionUser(String professionUser) {
		this.professionUser = professionUser;
	}

	@Column(name = "pwdUser", length = 254)
	public String getPwdUser() {
		return this.pwdUser;
	}

	public void setPwdUser(String pwdUser) {
		this.pwdUser = pwdUser;
	}

	@Column(name = "userName", length = 254)
	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	@ManyToMany(fetch = FetchType.LAZY,cascade = {CascadeType.ALL})
	@JoinTable(name = "USER_ROLE", catalog = "GED_DB2", joinColumns = { @JoinColumn(name = "userlist_userID", nullable = false, updatable = false) }, inverseJoinColumns = { @JoinColumn(name = "roles_roleId", nullable = false, updatable = false) })
	public Set<Roles> getRoleses() {
		return this.roleses;
	}

	public void setRoleses(Set<Roles> roleses) {
		this.roleses = roleses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user" ,cascade = {CascadeType.ALL})
	public Set<Document> getDocuments() {
		return this.documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}

}
