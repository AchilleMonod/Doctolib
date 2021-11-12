package sopra.doctolib.model;

import java.util.ArrayList;
import java.util.List;

public class Utilisateur {
private Long id;
private String email;
private String motDePasse;
private Type type;
private List<Patient> patients = new ArrayList<Patient>();
private Praticien praticien;



}
