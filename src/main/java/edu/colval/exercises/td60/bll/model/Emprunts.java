package edu.colval.exercises.td60.bll.model;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Table(name = "Emprunts")
@Data
public class Emprunts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @Column(name = "emprunt_id", updatable = false, nullable = false)
    private int empruntId;

    @Column(name = "utilisateur_id")
    private int utilisateurId;

    @Column(name = "ememplaire_id")
    private int ememplaireId;

    @Column(name = "date_emprunt")
    private Date dateEmprunt;

    @Column(name = "date_retour_prevu")
    private Date dateRetourPrevu;

    @Column(name = "date_retour_effective")
    private Date dateRetourEffective;

    @Column(name = "statut")
    private String statut;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id", nullable = false, insertable = false, updatable = false)
    private Utilisateurs utilisateur;

    @ManyToOne
    @JoinColumn(name = "ememplaire_id", nullable = false, insertable = false, updatable = false)
    private Exemplaires exemplaire;
}
