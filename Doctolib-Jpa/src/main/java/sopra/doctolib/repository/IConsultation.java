package sopra.doctolib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.doctolib.model.Lieu;

public interface IConsultation extends JpaRepository<Lieu, Long> {

}
