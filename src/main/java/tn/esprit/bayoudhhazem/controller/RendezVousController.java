package tn.esprit.bayoudhhazem.controller;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;
import tn.esprit.bayoudhhazem.entities.RendezVous;
import tn.esprit.bayoudhhazem.entities.Specialite;
import tn.esprit.bayoudhhazem.services.IServiceRendezVous;

import java.util.List;

@RestController
@AllArgsConstructor
public class RendezVousController {

    IServiceRendezVous iServiceRendezVous;

    @PostMapping("/addRDVAndassignMedAndPatient/{idMedecin}/{idPatient}")
    @ResponseBody
    public void addRDVAndAssignMedAndPatient(@RequestBody RendezVous rdv, @PathVariable Long idMedecin,@PathVariable Long idPatient){
        iServiceRendezVous.addRDVAndAssignMedAndPatient(rdv,idMedecin,idPatient);
    }

    @GetMapping("/getRendezVousBy/{idClinique}/{specialite}")
    public List<RendezVous> getRendezVousByCliniqueAndSpecialite(@PathVariable Long idClinique,@PathVariable Specialite specialite) {
    return iServiceRendezVous.getRendezVousByCliniqueAndSpecialite(idClinique,specialite);
    }

@GetMapping("/CountNbrRendezVous/{idMedecin}")
public int getNbrRendezVousMedecin(@PathVariable Long idMedecin) {
return iServiceRendezVous.getNbrRendezVousMedecin(idMedecin);
    }

}
