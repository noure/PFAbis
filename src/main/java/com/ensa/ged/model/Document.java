package com.ensa.ged.model;

// Generated Jun 18, 2014 11:36:08 PM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import antlr.StringUtils;

/**
 * Document generated by hbm2java
 */
@Entity
@Table(name = "Document", catalog = "GED_DB2")
public class Document implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idDocument;
	private Repertory repertory;
	private Groupe groupe;
	private User user;
	private TypeDocument typeDocument;
	private Date dateEdition;
	private Date dateIncertion;
	private Date dateMiseAjour;
	private Integer tailleDoc;
	private String themeDoc;
	private String commentaire;
	private String link;
	private Set<TextPrivate> textPrivates = new HashSet<TextPrivate>(0);
	private Set<History> histories = new HashSet<History>(0);
	private Set<MotCle> motCles = new HashSet<MotCle>(0);
	private Set<TextPublic> textPublics = new HashSet<TextPublic>(0);
	

	public Document() {
	}

	public Document(long idDocument, Repertory repertory, User user,
			TypeDocument typeDocument) {
		this.idDocument = idDocument;
		this.repertory = repertory;
		this.user = user;
		this.typeDocument = typeDocument;
	}

	public Document(long idDocument, Repertory repertory, Groupe groupe,
			User user, TypeDocument typeDocument, Date dateEdition,
			Date dateIncertion, Date dateMiseAjour, Integer tailleDoc,
			String themeDoc, String titre, Set<TextPrivate> textPrivates, Set<History> histories,
			Set<MotCle> motCles, Set<TextPublic> textPublics) {
		this.idDocument = idDocument;
		this.repertory = repertory;
		this.groupe = groupe;
		this.user = user;
		this.typeDocument = typeDocument;
		this.dateEdition = dateEdition;
		this.dateIncertion = dateIncertion;
		this.dateMiseAjour = dateMiseAjour;
		this.tailleDoc = tailleDoc;
		this.themeDoc = themeDoc;
		this.commentaire = titre;
		this.textPrivates = textPrivates;
		this.histories = histories;
		this.motCles = motCles;
		this.textPublics = textPublics;
	}

	@Id
	@Column(name = "idDocument", unique = true, nullable = false)
	public long getIdDocument() {
		return this.idDocument;
	}

	public void setIdDocument(long idDocument) {
		this.idDocument = idDocument;
	}

	@ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.ALL})
	@JoinColumn(name = "idRepertory", nullable = false)
	public Repertory getRepertory() {
		return this.repertory;
	}

	public void setRepertory(Repertory repertory) {
		this.repertory = repertory;
	}

	@ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.ALL})
	@JoinColumn(name = "idGroupe")
	public Groupe getGroupe() {
		return this.groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}

	@ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.ALL})
	@JoinColumn(name = "userID", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY,cascade = {CascadeType.ALL})
	@JoinColumn(name = "idTypeDoc", nullable = false)
	public TypeDocument getTypeDocument() {
		return this.typeDocument;
	}

	public void setTypeDocument(TypeDocument typeDocument) {
		this.typeDocument = typeDocument;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateEdition", length = 19)
	public Date getDateEdition() {
		return this.dateEdition;
	}

	public void setDateEdition(Date dateEdition) {
		this.dateEdition = dateEdition;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateIncertion", length = 19)
	public Date getDateIncertion() {
		return this.dateIncertion;
	}

	public void setDateIncertion(Date dateIncertion) {
		this.dateIncertion = dateIncertion;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "dateMiseAjour", length = 19)
	public Date getDateMiseAjour() {
		return this.dateMiseAjour;
	}

	public void setDateMiseAjour(Date dateMiseAjour) {
		this.dateMiseAjour = dateMiseAjour;
	}

	@Column(name = "tailleDoc")
	public Integer getTailleDoc() {
		return this.tailleDoc;
	}

	public void setTailleDoc(Integer tailleDoc) {
		this.tailleDoc = tailleDoc;
	}

	@Column(name = "themeDoc", length = 20)
	public String getThemeDoc() {
		return this.themeDoc;
	}

	public void setThemeDoc(String themeDoc) {
		this.themeDoc = themeDoc;
	}

	@Column(name = "commentaire", length =256)
	public String getCommentaire() {
		return this.commentaire;
	}

	public void setCommentaire(String titre) {
		this.commentaire = titre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "document",cascade = {CascadeType.ALL})
	public Set<TextPrivate> getTextPrivates() {
		return this.textPrivates;
	}

	public void setTextPrivates(Set<TextPrivate> textPrivates) {
		this.textPrivates = textPrivates;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "document",cascade = {CascadeType.ALL})
	public Set<History> getHistories() {
		return this.histories;
	}

	public void setHistories(Set<History> histories) {
		this.histories = histories;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "document",cascade = {CascadeType.ALL})
	public Set<MotCle> getMotCles() {
		return this.motCles;
	}

	public void setMotCles(Set<MotCle> motCles) {
		this.motCles = motCles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "document",cascade = {CascadeType.ALL})
	public Set<TextPublic> getTextPublics() {
		return this.textPublics;
	}

	public void setTextPublics(Set<TextPublic> textPublics) {
		this.textPublics = textPublics;
	}

	@Column(name = "link", length =500)
	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

}
