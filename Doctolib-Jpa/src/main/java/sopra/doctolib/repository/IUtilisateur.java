package sopra.doctolib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.doctolib.config.Utilisateur;

public interface IUtilisateur extends JpaRepository<Utilisateur, Long> {

}
