package tn.esprit.bayoudhhazem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.bayoudhhazem.entities.RendezVous;
import tn.esprit.bayoudhhazem.entities.Specialite;

import java.util.Date;
import java.util.List;

public interface RendezVousRepository extends JpaRepository<RendezVous,Long>{

    public List<RendezVous> findByMedecinCliniquesIdCliniqueAndMedecinSpecialite(Long idClinique, Specialite specialite);

    public int countByMedecinIdMedecin(Long idMedecin);

    @Query("SELECT  r FROM RendezVous r where  r.dateRDV >=? 1 and r.dateRDV<=? 2 and r.medecin.idMedecin=? 3")
    List<RendezVous> ListRDVBetweenToDate(Date dateD , Date dateF, Long idMedecin);

}
