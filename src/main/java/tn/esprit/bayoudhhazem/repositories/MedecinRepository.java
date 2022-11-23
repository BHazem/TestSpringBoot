package tn.esprit.bayoudhhazem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;
import tn.esprit.bayoudhhazem.entities.Medecin;
import tn.esprit.bayoudhhazem.entities.RendezVous;

import java.util.Date;
import java.util.List;

public interface MedecinRepository extends JpaRepository<Medecin,Long> {



}
