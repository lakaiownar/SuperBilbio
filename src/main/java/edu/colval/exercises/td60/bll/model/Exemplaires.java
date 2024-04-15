package edu.colval.exercises.td60.bll.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Exemplaires")
@Data
public class Exemplaires {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @Column(name = "exemplaire_id")
    private int exemplaireId;

    @Column(name = "livre_id")
    private int livreId;

    @Column(name = "statut")
    private String statut;

    @ManyToOne
    @JoinColumn(name = "livre_id", nullable = false, insertable = false, updatable = false)
    private Livre livre;
}
