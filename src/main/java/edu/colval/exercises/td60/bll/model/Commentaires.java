package edu.colval.exercises.td60.bll.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.sql.Date;

@Entity
@Table(name = "Commentaires")
@Data
public class Commentaires {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "increment")
    @Column(name = "commentaire_id", updatable = false, nullable = false)
    private int commentaireId;

    @Column(name = "utilisateur_id")
    private int utilisateurId;

    @Column(name = "livre_id")
    private int livreId;

    @Column(name = "contenu")
    private String contenu;

    @Column(name = "date_commentaire")
    private Date dateCommentaire;

    @Column(name = "note")
    private int note;

    @ManyToOne
    @JoinColumn(name = "utilisateur_id", nullable = false, insertable = false, updatable = false)
    private Utilisateurs utilisateur;

    @ManyToOne
    @JoinColumn(name = "livre_id", nullable = false, insertable = false, updatable = false)
    private Livre livre;
}
