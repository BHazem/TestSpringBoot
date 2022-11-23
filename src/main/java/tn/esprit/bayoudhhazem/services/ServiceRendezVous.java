package tn.esprit.bayoudhhazem.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.bayoudhhazem.entities.Medecin;
import tn.esprit.bayoudhhazem.entities.Patient;
import tn.esprit.bayoudhhazem.entities.RendezVous;
import tn.esprit.bayoudhhazem.entities.Specialite;
import tn.esprit.bayoudhhazem.repositories.MedecinRepository;
import tn.esprit.bayoudhhazem.repositories.PatientRepository;
import tn.esprit.bayoudhhazem.repositories.RendezVousRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class ServiceRendezVous implements IServiceRendezVous{

    RendezVousRepository rendezVousRepository;
    MedecinRepository medecinRepository;
    PatientRepository patientRepository;


    @Override
    public void addRDVAndAssignMedAndPatient(RendezVous rdv, Long idMedecin, Long idPatient) {
        Medecin medecin = medecinRepository.findById(idMedecin).orElse(null);
        Patient patient = patientRepository.findById(idPatient).orElse(null);
        rdv.setPatient(patient);
        rdv.setMedecin(medecin);
        rendezVousRepository.save(rdv);
    }

    @Override
    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialite specialite) {
        return rendezVousRepository.findByMedecinCliniquesIdCliniqueAndMedecinSpecialite(idClinique,specialite);
    }

    @Override
    public int getNbrRendezVousMedecin(Long idMedecin) {
        return rendezVousRepository.countByMedecinIdMedecin(idMedecin);
    }
}
