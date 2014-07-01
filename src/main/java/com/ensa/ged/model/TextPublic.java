package com.ensa.ged.model;

// Generated Jun 18, 2014 11:36:08 PM by Hibernate Tools 4.0.0

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * TextPublic generated by hbm2java
 */
@Entity
@Table(name = "TextPublic", catalog = "GED_DB2")
public class TextPublic implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long idTextPub;
	private Document document;
	private String titreTexPub;

	public TextPublic() {
	}

	public TextPublic(long idTextPub, Document document) {
		this.idTextPub = idTextPub;
		this.document = document;
	}

	public TextPublic(long idTextPub, Document document, String titreTexPub) {
		this.idTextPub = idTextPub;
		this.document = document;
		this.titreTexPub = titreTexPub;
	}

	@Id
	@GenericGenerator(name="incr" , strategy="increment")
	@GeneratedValue(generator="incr")
	@Column(name = "idTextPub", unique = true, nullable = false)
	public long getIdTextPub() {
		return this.idTextPub;
	}

	public void setIdTextPub(long idTextPub) {
		this.idTextPub = idTextPub;
	}

	@ManyToOne(fetch = FetchType.LAZY ,cascade = {CascadeType.ALL})
	@JoinColumn(name = "idDocument", nullable = false)
	public Document getDocument() {
		return this.document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	@Column(name = "titreTexPub", length = 254)
	public String getTitreTexPub() {
		return this.titreTexPub;
	}

	public void setTitreTexPub(String titreTexPub) {
		this.titreTexPub = titreTexPub;
	}

}
