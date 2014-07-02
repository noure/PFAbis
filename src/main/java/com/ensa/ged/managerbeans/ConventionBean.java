package com.ensa.ged.managerbeans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;

import org.primefaces.event.FlowEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.ensa.ged.model.Convention;
import com.ensa.ged.model.Membre;
import com.ensa.ged.model.Obligation;
import com.ensa.ged.service.IConventionService;
import com.ensa.ged.service.IMembreService;
import com.ensa.ged.service.IObligationService;

@Component("conventionBean")
@Scope("session")
public class ConventionBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Autowired
	IConventionService conventionService;
	@Autowired
	IMembreService membreService;
	@Autowired
	IObligationService engagmentService;

	private String titre;
	private Date debut;
	private Date fin;
	private String membre;
	private String engagement_muni;
	private String eng1;
	private String eng2;

	private List<Membre> membres = new ArrayList<>();
	private List<Convention> conventions = new ArrayList<>();
	private List<Obligation> engagementList1 = new ArrayList<Obligation>();
	private List<Obligation> engagementList2 = new ArrayList<Obligation>();

	Membre membre1 = new Membre();
	Membre membre2 = new Membre();

	private Convention convention;

	@PostConstruct
	public void init() {
		conventions = conventionService.findAll();

		convention = new Convention();

	}

	public void ajouterEngagement() {
		Obligation obligation1= new Obligation();
		obligation1.setObligation(eng1);
		obligation1.setMembre(membres.get(1));
		engagmentService.create(obligation1);
		engagementList1.add(obligation1);

	}

	public void ajouterEngagementbis() {
		Obligation obligation2 = new Obligation();
		obligation2.setObligation(eng2);
		obligation2.setMembre(membres.get(0));
		engagmentService.create(obligation2);
		System.out.println("apres creation d obligation");
		engagementList2.add(obligation2);

	}

	public void ajouterMembre() {

		Membre mem = new Membre();
		mem.setConvention(convention);
		mem.setNom(membre);

		membreService.create(mem);

		membres.add(mem);

	}

	public void ajouter() {
		// this.affecter();
		conventionService.create(convention);

		init();

	}

	public String preparerMiseAjour(long userId) {

		convention = conventionService.findOne(userId);
		return "editUser";
	}

	public String modifier() {

		conventionService.update(convention);

		init();
		convention = new Convention();
		return "listUsers";
	}

	public String preparerSuppression(long userId) {
		convention = conventionService.findOne(userId);
		return "deletUser";
	}

	public String supprimer() {
		conventionService.delete(convention);

		init();
		convention = new Convention();
		return "listUsers";
	}

	public String onFlowProcess(FlowEvent event) {

		switch (event.getNewStep()) {
		case "Convention":
			ajouter();

			break;
		case "Membres":
			ajouterMembre();

			break;
		case "Engagements":

			break;
		default:
			break;
		}
		return event.getNewStep();

	}

	public String retour() {

		init();
		return "listUsers";
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Date getDebut() {
		return debut;
	}

	public void setDebut(Date debut) {
		this.debut = debut;
	}

	public Date getFin() {
		return fin;
	}

	public void setFin(Date fin) {
		this.fin = fin;
	}

	public String getMembre() {
		return membre;
	}

	public void setMembre(String membre) {
		this.membre = membre;
	}

	public String getEngagement_muni() {
		return engagement_muni;
	}

	public void setEngagement_muni(String engagement_muni) {
		this.engagement_muni = engagement_muni;
	}

	public List<Membre> getMembres() {
		return membres;
	}

	public void setMembres(List<Membre> membres) {
		this.membres = membres;
	}

	public List<Convention> getConventions() {
		return conventions;
	}

	public void setConventions(List<Convention> conventions) {
		this.conventions = conventions;
	}

	public Membre getMembre1() {
		return membre1;
	}

	public void setMembre1(Membre membre1) {
		this.membre1 = membre1;
	}

	public Membre getMembre2() {
		return membre2;
	}

	public void setMembre2(Membre membre2) {
		this.membre2 = membre2;
	}

	public String getEng1() {
		return eng1;
	}

	public void setEng1(String eng1) {
		this.eng1 = eng1;
	}

	public String getEng2() {
		return eng2;
	}

	public void setEng2(String eng2) {
		this.eng2 = eng2;
	}

	public List<Obligation> getEngagementList1() {
		return engagementList1;
	}

	public void setEngagementList1(List<Obligation> engagementList1) {
		this.engagementList1 = engagementList1;
	}

	public List<Obligation> getEngagementList2() {
		return engagementList2;
	}

	public void setEngagementList2(List<Obligation> engagementList2) {
		this.engagementList2 = engagementList2;
	}

}