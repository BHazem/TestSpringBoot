package tn.esprit.bayoudhhazem.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.bayoudhhazem.entities.Clinique;
import tn.esprit.bayoudhhazem.entities.Medecin;
import tn.esprit.bayoudhhazem.repositories.CliniqueRepository;
import tn.esprit.bayoudhhazem.repositories.MedecinRepository;

import javax.transaction.Transactional;
import java.util.Date;

@Service
@AllArgsConstructor
public class ServiceMedecin implements  IServiceMedecin{

    MedecinRepository medecinRepository;
    CliniqueRepository cliniqueRepository;

    @Override
    @Transactional
    public Medecin addMedecinAndAssignToClinique(Medecin medecin, Long cliniqueId) {
        Clinique clinique = cliniqueRepository.findById(cliniqueId).orElse(null);
        clinique.getMedecins().add(medecin);
        return medecin;
    }

    @Override
    public int getRevenuMedecin(Long idMedecin, Date startDate, Date endDate) {
    int size = medecinRepository.ListRDVBetweenToDate(startDate,endDate,idMedecin).size();
    Medecin medecin = medecinRepository.findById(idMedecin).orElse(null);
    int Montant =medecin.getPrixConsultation()*size;
        return Montant;
    }
}
