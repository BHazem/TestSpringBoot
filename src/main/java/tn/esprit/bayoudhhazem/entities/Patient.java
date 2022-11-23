package tn.esprit.bayoudhhazem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table( name = "Patient")
public class Patient implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;
    private String nomPatient;
    private int telephone;
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    @JsonIgnore
    @OneToMany(mappedBy = "medecin",cascade = CascadeType.ALL)
    private Set<RendezVous> rendezVous;
}
