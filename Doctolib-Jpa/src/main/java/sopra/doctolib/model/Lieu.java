package sopra.doctolib.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;



@Entity
@Table(name = "subject")
public class Lieu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Version
	private int version;
	@Column(name = "name")
	private String nom;
	@Column(name = "information")
	private String information;
	@ManyToOne
	private Praticien praticien;
	@OneToMany(mappedBy = "lieu")
	private List<Creneau> creneaux = new ArrayList<Creneau>();
	
	private Adresse adresse;
}
