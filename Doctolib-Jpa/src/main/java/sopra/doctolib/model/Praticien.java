package sopra.doctolib.model;

import java.util.ArrayList;
import java.util.List;

public class Praticien {
	
private Long id;
private Civilite civilite;
private String Nom;
private String prenom;
private String telephone;
private Secteur secteur;
private  boolean carteVitale;
private  boolean cheque;
private  boolean espece;
private  Integer dureeCreneau;

private List<Specialite> specialites=new ArrayList<Specialite>();
private List<Lieu> lieux=new ArrayList<Lieu>();

}
