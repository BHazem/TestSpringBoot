package tn.esprit.bayoudhhazem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.bayoudhhazem.entities.RendezVous;
import tn.esprit.bayoudhhazem.entities.Specialite;

import java.util.List;

public interface RendezVousRepository extends JpaRepository<RendezVous,Long>{

    public List<RendezVous> findByMedecinCliniquesIdCliniqueAndMedecinSpecialite(Long idClinique, Specialite specialite);

    public int countByMedecinIdMedecin(Long idMedecin);

}
