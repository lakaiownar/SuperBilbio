package edu.colval.exercises.td60.bll.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Entity
@Table(name = "Reservations")
@Data
public class Reservations {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @Column(name = "reservation_id", updatable = false, nullable = false)
    private int reservationId;

    @Column(name = "utilisteur_id")
    private Integer utilisateurId;

    @Column(name = "livre_id")
    private int livreId;

    @NotNull(message = "DateReservation is mandatory")
    @Column(name = "date_reservation")
    private String dateReservation;

    @NotNull(message = "Statut is mandatory")
    @Column(name = "statut")
    private String statut;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id", nullable = false, insertable = false, updatable = false)
    private Utilisateurs utilisateur;

    @ManyToOne
    @JoinColumn(name = "livre_id", nullable = false, insertable = false, updatable = false)
    private Livre livre;
}