package tn.esprit.bayoudhhazem.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.bayoudhhazem.entities.Clinique;
import tn.esprit.bayoudhhazem.entities.Patient;
import tn.esprit.bayoudhhazem.services.IServicePatient;

@RestController
@AllArgsConstructor
public class PatientController {

    IServicePatient iServicePatient;

    @PostMapping("/addPatient")
    @ResponseBody
    public Patient addPatient(@RequestBody Patient p){
        return iServicePatient.addPatient(p);
    }
}
