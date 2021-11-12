package sopra.doctolib.model;

import java.time.LocalDateTime;

public class Creneau {

	private Long id;
	private LocalDateTime debut;
	private Integer duree;
	private boolean dispo;
	private Consultation consultation;
	private Praticien praticien;
	private Lieu lieu;
	
}
