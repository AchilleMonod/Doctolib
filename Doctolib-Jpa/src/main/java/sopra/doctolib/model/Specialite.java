package sopra.doctolib.model;

import java.util.ArrayList;
import java.util.List;

public class Specialite {
	private Long id;
	private String nom;
	private Praticien praticien;
	private List<Motif> motifs = new ArrayList<Motif>();

}
