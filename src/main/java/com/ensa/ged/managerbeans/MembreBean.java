package com.ensa.ged.managerbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.ensa.ged.model.Membre;
import com.ensa.ged.service.impl.MembreService;

@Component("membreBean")
@Scope("session")
public class MembreBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Autowired
	MembreService membreService;
	String mem;
	Membre membre = new Membre();
	List<Membre> membres = new ArrayList<>();

	@PostConstruct
	public void init() {
		membres = membreService.findAll();
		membre = new Membre();
	}

	/**
	 * prépare l'ajoute d'un nouveau utilisateur
	 */
	public void preparerAjoute() {

		membre = new Membre();

	}

	public void ajouter() {
		this.affecter();
		membreService.create(membre);

		init();
		mem = "";

	}

	private void affecter() {
		membre.setNom(mem);

	}

	public String preparerMiseAjour(long userId) {

		membre = membreService.findOne(userId);
		return "editUser";
	}

	public String modifier() {

		membreService.update(membre);

		init();

		return "listUsers";
	}

	public String preparerSuppression(long userId) {
		membre = membreService.findOne(userId);
		return "deletUser";
	}

	public void supprimer() {
		membreService.delete(membre);

		init();
		
		
	}
}
