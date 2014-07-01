package com.ensa.ged.model;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * TypeDocument generated by hbm2java
 */
@Entity
@Table(name = "TypeDocument", catalog = "GED_DB")
public class TypeDocument implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idTypeDoc;
	private String nameTypeDoc;
	private Set<Document> documents = new HashSet<Document>(0);

	public TypeDocument() {
	}

	public TypeDocument(int idTypeDoc) {
		this.idTypeDoc = idTypeDoc;
	}

	public TypeDocument(int idTypeDoc, String nameTypeDoc, Set<Document> documents) {
		this.idTypeDoc = idTypeDoc;
		this.nameTypeDoc = nameTypeDoc;
		this.documents = documents;
	}

	@Id
	@GenericGenerator(name="incr" , strategy="increment")
	@GeneratedValue(generator="incr")
	@Column(name = "idTypeDoc", unique = true, nullable = false)
	public int getIdTypeDoc() {
		return this.idTypeDoc;
	}

	public void setIdTypeDoc(int idTypeDoc) {
		this.idTypeDoc = idTypeDoc;
	}

	@Column(name = "nameTypeDoc", length = 254)
	public String getNameTypeDoc() {
		return this.nameTypeDoc;
	}

	public void setNameTypeDoc(String nameTypeDoc) {
		this.nameTypeDoc = nameTypeDoc;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "typeDocument")
	public Set<Document> getDocuments() {
		return this.documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}

}
