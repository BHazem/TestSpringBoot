package tn.esprit.bayoudhhazem.services;

import tn.esprit.bayoudhhazem.entities.Medecin;

import java.util.Date;

public interface IServiceMedecin {

public Medecin addMedecinAndAssignToClinique(Medecin medecin,Long cliniqueId);

public int getRevenuMedecin(Long idMedecin, Date startDate,Date endDate);
}
