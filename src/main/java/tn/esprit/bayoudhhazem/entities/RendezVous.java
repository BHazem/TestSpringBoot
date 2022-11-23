package tn.esprit.bayoudhhazem.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table( name = "RendezVous")
public class RendezVous implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long idRDV;
    @Temporal(TemporalType.DATE)
private Date dateRDV;
private String remarque;

@ManyToOne(cascade = CascadeType.ALL)
private Medecin medecin;

@ManyToOne(cascade = CascadeType.ALL)
    private Patient patient;

}
