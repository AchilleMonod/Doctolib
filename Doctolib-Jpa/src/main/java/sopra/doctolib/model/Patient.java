package sopra.doctolib.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patient {
	private Long id;
	private Civilite civilite;
	private String nom;
	private String prenom;
	private String telephone;
	private LocalDate dtNaissance;
	private String email;
	private boolean principale;
	private List<Consultation> consultations= new ArrayList<Consultation>();
	private Adresse adresse;
	private Utilisateur utilisateur;
	

}
