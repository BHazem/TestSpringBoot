package tn.esprit.bayoudhhazem.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.bayoudhhazem.entities.Clinique;
import tn.esprit.bayoudhhazem.services.IServiceClinique;

@RestController
@AllArgsConstructor
public class CliniqueController {

    IServiceClinique iServiceClinique;

    @PostMapping("/addClinique")
    @ResponseBody
    public Clinique addContrat(@RequestBody Clinique c){
        return iServiceClinique.addClinique(c);
    }


}
