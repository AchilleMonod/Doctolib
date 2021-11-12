package sopra.doctolib.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "Praticien")
public class Praticien {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Version
private int version;
private Civilite civilite;
private String Nom;
private String prenom;
private String telephone;
private Secteur secteur;
private  boolean carteVitale;
private  boolean cheque;
private  boolean espece;
private  Integer dureeCreneau;
@OneToMany(mappedBy = "praticien")
private List<Lieu> lieu;
@OneToMany(mappedBy = "praticien")
private List<Specialite> specialite;
@OneToMany(mappedBy = "praticien")
private List<Creneau> creneau;

private List<Specialite> specialites=new ArrayList<Specialite>();
private List<Lieu> lieux=new ArrayList<Lieu>();



public Praticien() {
	super();
}



public Praticien(Long id, Civilite civilite, String nom, String prenom, String telephone, Secteur secteur,
		boolean carteVitale, boolean cheque, boolean espece, Integer dureeCreneau, List<Specialite> specialites,
		List<Lieu> lieux) {
	this.id = id;
	this.civilite = civilite;
	Nom = nom;
	this.prenom = prenom;
	this.telephone = telephone;
	this.secteur = secteur;
	this.carteVitale = carteVitale;
	this.cheque = cheque;
	this.espece = espece;
	this.dureeCreneau = dureeCreneau;
	this.specialites = specialites;
	this.lieux = lieux;
}



public Long getId() {
	return id;
}



public void setId(Long id) {
	this.id = id;
}



public Civilite getCivilite() {
	return civilite;
}



public void setCivilite(Civilite civilite) {
	this.civilite = civilite;
}



public String getNom() {
	return Nom;
}



public void setNom(String nom) {
	Nom = nom;
}



public String getPrenom() {
	return prenom;
}



public void setPrenom(String prenom) {
	this.prenom = prenom;
}



public String getTelephone() {
	return telephone;
}



public void setTelephone(String telephone) {
	this.telephone = telephone;
}



public Secteur getSecteur() {
	return secteur;
}



public void setSecteur(Secteur secteur) {
	this.secteur = secteur;
}



public boolean isCarteVitale() {
	return carteVitale;
}



public void setCarteVitale(boolean carteVitale) {
	this.carteVitale = carteVitale;
}



public boolean isCheque() {
	return cheque;
}



public void setCheque(boolean cheque) {
	this.cheque = cheque;
}



public boolean isEspece() {
	return espece;
}



public void setEspece(boolean espece) {
	this.espece = espece;
}



public Integer getDureeCreneau() {
	return dureeCreneau;
}



public void setDureeCreneau(Integer dureeCreneau) {
	this.dureeCreneau = dureeCreneau;
}



public List<Specialite> getSpecialites() {
	return specialites;
}



public void setSpecialites(List<Specialite> specialites) {
	this.specialites = specialites;
}



public List<Lieu> getLieux() {
	return lieux;
}



public void setLieux(List<Lieu> lieux) {
	this.lieux = lieux;
}



@Override
public String toString() {
	return "Praticien [id=" + id + ", civilite=" + civilite + ", Nom=" + Nom + ", prenom=" + prenom + ", telephone="
			+ telephone + ", secteur=" + secteur + ", carteVitale=" + carteVitale + ", cheque=" + cheque + ", espece="
			+ espece + ", dureeCreneau=" + dureeCreneau + ", specialites=" + specialites + ", lieux=" + lieux + "]";
}



}
