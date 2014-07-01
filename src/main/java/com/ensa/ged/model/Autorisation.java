package com.ensa.ged.model;

// Generated Jun 19, 2014 11:39:07 PM by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * Autorisation generated by hbm2java
 */
@Entity
@Table(name = "Autorisation", catalog = "GED_DB2")
public class Autorisation implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private Personne personne;
	private Date debut;
	private Date fin;
	private String exception;
	private Set<Decison> decisons = new HashSet<Decison>(0);

	public Autorisation() {
	}

	public Autorisation(int id, Personne personne) {
		this.id = id;
		this.personne = personne;
	}

	public Autorisation(int id, Personne personne, Date debut, Date fin,
			String exception, Set<Decison> decisons) {
		this.id = id;
		this.personne = personne;
		this.debut = debut;
		this.fin = fin;
		this.exception = exception;
		this.decisons = decisons;
	}

	@Id
	@GenericGenerator(name="incr" , strategy="increment")
	@GeneratedValue(generator="incr")
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Per_id", nullable = false)
	public Personne getPersonne() {
		return this.personne;
	}

	public void setPersonne(Personne personne) {
		this.personne = personne;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "debut", length = 19)
	public Date getDebut() {
		return this.debut;
	}

	public void setDebut(Date debut) {
		this.debut = debut;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "fin", length = 19)
	public Date getFin() {
		return this.fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	@Column(name = "exception", length = 254)
	public String getException() {
		return this.exception;
	}

	public void setException(String exception) {
		this.exception = exception;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "autorisation",cascade = {CascadeType.ALL})
	public Set<Decison> getDecisons() {
		return this.decisons;
	}

	public void setDecisons(Set<Decison> decisons) {
		this.decisons = decisons;
	}

}
