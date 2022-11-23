package tn.esprit.bayoudhhazem.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table( name = "Medecin")
public class Medecin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMedecin;
    private String nomMedecin;

    @Enumerated(EnumType.STRING)
    private Specialite specialite;
    private int telephone;
    private int prixConsultation;

    @JsonIgnore
    @ManyToMany(mappedBy = "medecins",cascade = CascadeType.ALL)
    private Set<Clinique> cliniques;

    @JsonIgnore
    @OneToMany(mappedBy = "medecin",cascade = CascadeType.ALL)
    private Set<RendezVous> rendezVous;
}
