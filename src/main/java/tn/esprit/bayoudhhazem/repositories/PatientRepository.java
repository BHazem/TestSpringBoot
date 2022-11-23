package tn.esprit.bayoudhhazem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.bayoudhhazem.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient,Long> {
}
