package com.ensa.ged.model;

// Generated Jun 18, 2014 11:36:08 PM by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SousRepertory generated by hbm2java
 */
@Entity
@Table(name = "SousRepertory", catalog = "GED_DB2")
public class SousRepertory implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private SousRepertoryId id;
	private Repertory repertory;
	private String nameRepertory;
	private String nameSousRepertory;

	public SousRepertory() {
	}

	public SousRepertory(SousRepertoryId id, Repertory repertory) {
		this.id = id;
		this.repertory = repertory;
	}

	public SousRepertory(SousRepertoryId id, Repertory repertory,
			String nameRepertory, String nameSousRepertory) {
		this.id = id;
		this.repertory = repertory;
		this.nameRepertory = nameRepertory;
		this.nameSousRepertory = nameSousRepertory;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idRepertory", column = @Column(name = "idRepertory", nullable = false)),
			@AttributeOverride(name = "idSousRepertory", column = @Column(name = "idSousRepertory", nullable = false)) })
	public SousRepertoryId getId() {
		return this.id;
	}

	public void setId(SousRepertoryId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idRepertory", nullable = false, insertable = false, updatable = false)
	public Repertory getRepertory() {
		return this.repertory;
	}

	public void setRepertory(Repertory repertory) {
		this.repertory = repertory;
	}

	@Column(name = "nameRepertory", length = 254)
	public String getNameRepertory() {
		return this.nameRepertory;
	}

	public void setNameRepertory(String nameRepertory) {
		this.nameRepertory = nameRepertory;
	}

	@Column(name = "nameSousRepertory", length = 254)
	public String getNameSousRepertory() {
		return this.nameSousRepertory;
	}

	public void setNameSousRepertory(String nameSousRepertory) {
		this.nameSousRepertory = nameSousRepertory;
	}

}