package tn.esprit.bayoudhhazem.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.bayoudhhazem.entities.Medecin;
import tn.esprit.bayoudhhazem.services.IServiceMedecin;

import java.util.Date;

@RestController
@AllArgsConstructor
public class MedecinController {

    IServiceMedecin iServiceMedecin;

    @PostMapping("/addMedecinAndAssignToClinique/{cliniqueId}")
    @ResponseBody
    public Medecin addMedecinAndAssignToClinique(@RequestBody Medecin medecin, @PathVariable Long cliniqueId) {
    return iServiceMedecin.addMedecinAndAssignToClinique(medecin,cliniqueId);
    }

    @GetMapping("/getMontantMedecin")
    public int getRevenuMedecin(@RequestParam Long idMedecin,@RequestParam Date startDate,@RequestParam Date endDate) {
    return iServiceMedecin.getRevenuMedecin(idMedecin,startDate,endDate);
    }
    }
