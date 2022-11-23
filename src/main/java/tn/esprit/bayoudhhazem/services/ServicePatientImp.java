package tn.esprit.bayoudhhazem.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.bayoudhhazem.entities.Patient;
import tn.esprit.bayoudhhazem.repositories.PatientRepository;

@Service
@AllArgsConstructor
public class ServicePatientImp implements IServicePatient {

    PatientRepository patientRepository;

    @Override
    public Patient addPatient(Patient p) {
        return patientRepository.save(p);
    }
}
