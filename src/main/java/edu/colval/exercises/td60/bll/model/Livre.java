package edu.colval.exercises.td60.bll.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Livres")
@Data
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @Column(name = "livre_id", updatable = false, nullable = false)
    private int livreId;

    @NotBlank(message = "Titre is mandatory")
    @Column(name ="titre")
    private String titre;

    @Column(name = "auteur_id")
    private int auteurId;

    @Column(name = "genre_id")
    private int genreId;

    @NotBlank(message = "Edition is mandatory")
    @Column(name = "edition")
    private String edition;

    @Column(name = "disponibilite")
    private boolean disponibilite;

    @ManyToOne
    @JoinColumn(name = "auteur_id", nullable = false, insertable = false, updatable = false)
    private Auteur auteur;

    @ManyToOne
    @JoinColumn(name = "genre_id", nullable = false, insertable = false, updatable = false)
    private Genre genre;
}
