package tn.esprit.bayoudhhazem.services;

import tn.esprit.bayoudhhazem.entities.RendezVous;
import tn.esprit.bayoudhhazem.entities.Specialite;

import java.util.List;

public interface IServiceRendezVous {

    public void addRDVAndAssignMedAndPatient(RendezVous rdv,Long idMedecin,Long idPatient);

    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(Long idClinique, Specialite specialite);

    public int getNbrRendezVousMedecin(Long idMedecin);
}
