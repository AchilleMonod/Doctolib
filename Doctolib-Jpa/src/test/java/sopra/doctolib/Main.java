package sopra.doctolib;

import java.text.SimpleDateFormat;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import sopra.formation.config.ApplicationConfig;


public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext spring = new AnnotationConfigApplicationContext(ApplicationConfig.class);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		IPraticienRepository praticienRepo = spring.getBean(IPraticienRepository.class);
		IPatientRepository patientRepo = spring.getBean(IPatientRepository.class);
		IAdresseRepository adresseRepo = spring.getBean(IAdresseRepository.class);
		ICreneauRepository creneauRepo = spring.getBean(ICreneauRepository.class);

		Patient michel = new Patient(); 
		michel.setCivilite(Civilite.MME);
		michel.setNom("BILAL");
		michel.setPrenom("Michel");
		michel.setTelephone("0606060606");
		michel.setDtNaissance(sdf.parse("12/12/1980"));
		michel.setEmail("michel.bilal@bean.fr");

		Patient odil = new Patient();
		odil.setCivilite(Civilite.MME);
		odil.setNom("DERAIE");
		odil.setPrenom("Odil");
		odil.setTelephone("0612121212");
		odil.setDtNaissance(sdf.parse("01/04/1968"));
		odil.setEmail("odil.deraie@bean.fr");
		
		
		Adresse adrPhilippe = new Adresse();

		adrPhilippe.setVoie("5 avenue du grand rond");
		adrPhilippe.setComplement("Résidence Jevousoigne");
		adrPhilippe.setCodePostal("Un milliard");
		adrPhilippe.setVille("Medicatown");
		
		
		Praticien philippe = new Praticien();
		philippe.setCivilite(Civilite.M);
		philippe.setNom("MEDECIN");
		philippe.setPrenom("Philippe");
		philippe.setTelephone("0612345678");
		philippe.setEmail("michel.bilal@chibre.fr");
		philippe.setAdresse(adrPhilippe);

	}

}
