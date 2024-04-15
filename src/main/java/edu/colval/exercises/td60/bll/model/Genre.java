package edu.colval.exercises.td60.bll.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Genres")
@Data
public class Genre {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @Column(name = "genre_id", updatable = false, nullable = false)
    private int genreId;

    @Column(name = "nom")
    private String nom;
}
