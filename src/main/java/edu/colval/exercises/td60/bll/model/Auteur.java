package edu.colval.exercises.td60.bll.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "Auteurs")
@Data
public class Auteur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @Column(name = "auteur_id", updatable = false, nullable = false)
    private int auteurId;

    @NotBlank(message = "Name is mandatory")
    @Size(max = 50, message = "Name must be less than 50 characters")
    @Column(name = "prenom")
    private String name;

    @NotBlank(message = "Lastname is mandatory")
    @Size(max = 50, message = "Lastname must be less than 50 characters")
    @Column(name = "nom")
    private String lastname;

    @Size(max = 500, message = "Biography must be less than 500 characters")
    @Column(name = "biographie")
    private String biography;
}