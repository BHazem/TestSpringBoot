package tn.esprit.bayoudhhazem.services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.bayoudhhazem.entities.Clinique;
import tn.esprit.bayoudhhazem.repositories.CliniqueRepository;

@Service
@AllArgsConstructor
public class ServiceCliniqueImp implements IServiceClinique{

CliniqueRepository cliniqueRepository;
    @Override
    public Clinique addClinique(Clinique c) {
        return cliniqueRepository.save(c);
    }
}
