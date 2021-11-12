package sopra.doctolib.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sopra.doctolib.model.Lieu;

public interface IPatient extends JpaRepository<Lieu, Long> {

}
