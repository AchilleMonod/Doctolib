package sopra.doctolib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.doctolib.model.Lieu;

public interface IPraticien extends JpaRepository<Lieu, Long> {

}
