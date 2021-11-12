package sopra.doctolib;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sopra.doctolib.config.AppConfig;
import sopra.doctolib.model.Adresse;
import sopra.doctolib.model.Civilite;
import sopra.doctolib.model.Patient;
import sopra.doctolib.model.Praticien;
import sopra.doctolib.model.Specialite;
import sopra.doctolib.model.Type;
import sopra.doctolib.model.Utilisateur;
import sopra.doctolib.repository.IAdresse;
import sopra.doctolib.repository.IConsultation;
import sopra.doctolib.repository.ICreneau;
import sopra.doctolib.repository.ILieu;
import sopra.doctolib.repository.IMotif;
import sopra.doctolib.repository.IPatient;
import sopra.doctolib.repository.IPraticien;
import sopra.doctolib.repository.ISpecialite;
import sopra.doctolib.repository.IUtilisateur;


public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext spring = new AnnotationConfigApplicationContext(AppConfig.class);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		IAdresse adresseRepo = spring.getBean(IAdresse.class);
		IConsultation consultationRepo = spring.getBean(IConsultation.class);
		ICreneau creneauRepo = spring.getBean(ICreneau.class);
		ILieu lieuRepo = spring.getBean(ILieu.class);
		IMotif motifRepo = spring.getBean(IMotif.class);
		IPatient patientRepo = spring.getBean(IPatient.class);
		IPraticien praticienRepo = spring.getBean(IPraticien.class);
		ISpecialite specialiteRepo = spring.getBean(ISpecialite.class);
		IUtilisateur utilisateurRepo = spring.getBean(IUtilisateur.class);

		
		

		Patient michel = new Patient(); 
		michel.setCivilite(Civilite.MME);
		michel.setNom("BILAL");
		michel.setPrenom("Michel");
		michel.setTelephone("0606060606");
		michel.setDtNaissance(sdf.parse("12/12/1980"));
		

		Patient odil = new Patient();
		odil.setCivilite(Civilite.MME);
		odil.setNom("DERAIE");
		odil.setPrenom("Odil");
		odil.setTelephone("0612121212");
		odil.setDtNaissance(sdf.parse("01/04/1968"));
		
		List<Patient> patientsMich = new ArrayList<Patient>();
		patientsMich.add(michel);
		patientsMich.add(odil);		
		
		Utilisateur michelUser = new Utilisateur();
		michelUser.setEmail("michel.bilal@bean.fr");
		michelUser.setMotDePasse("jadoreDaniel");
		michelUser.setType(Type.PATIENT);
		michelUser.setPatients(patientsMich);
		
		Adresse adrPhilippe1 = new Adresse();

		adrPhilippe1.setVoie("5 avenue du grand rond");
		adrPhilippe1.setComplement("Résidence Jevousoigne");
		adrPhilippe1.setCodePostal("Un milliard");
		adrPhilippe1.setVille("Medicatown");
		
		Adresse adrPhilippe2 = new Adresse();

		adrPhilippe2.setVoie("15 rue des poules");
		adrPhilippe2.setComplement("Hopital Iban");
		adrPhilippe2.setCodePostal("78400");
		adrPhilippe2.setVille("Pansement-City");
		
		Specialite coloscopeur = new Specialite();
		coloscopeur.setNom("coloscopeur");
		
		Specialite oncologue = new Specialite();
		oncologue.setNom("oncologue");
		
		List<Specialite> spePhilippe = new ArrayList();
		
		
		
		Praticien philippe = new Praticien();
		philippe.setCivilite(Civilite.M);
		philippe.setNom("MEDECIN");
		philippe.setPrenom("Philippe");
		philippe.setTelephone("0612345678");
		philippe.setEmail("michel.bilal@chibre.fr");
		philippe.setDureeCreneau(15);
		philippe.setSpecialites(spePhilippe);
		
		
	}

}
