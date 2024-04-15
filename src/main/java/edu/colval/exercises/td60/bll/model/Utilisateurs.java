package edu.colval.exercises.td60.bll.model;

import edu.colval.exercises.td60.bll.validation.PasswordValidator;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Table(name = "Utilisateurs")
@Data
public class Utilisateurs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @Column(name = "utilisateur_id", updatable = false)
    private int utilisateurId;

    @NotNull(message = "Nom should not be null")
    @Size(min = 1, max = 50)
    @Column(name = "nom")
    private String nom;

    @NotNull(message = "Prenom should not be null")
    @Size(min = 1, max = 50)
    @Column(name = "prenom")
    private String prenom;

    @NotNull(message = "Email should not be null")
    @Size(min = 1, max = 50)
    @Email(message = "Email should be valid")
    @Column(name = "adresse_email")
    private String email;

    @NotNull(message = "Password should not be null")
    @Size(min = 8)
    @PasswordValidator
    private String motDePasseHashed;

    @NotNull(message = "Role should not be null")
    @Size(min = 1, max = 50)
    @Column(name = "role")
    private String role;
}
