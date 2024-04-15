package edu.colval.exercises.td60.dal;

import edu.colval.exercises.td60.bll.model.Commentaires;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repository_Commentaires extends JpaRepository<Commentaires, Integer>{
    List<Commentaires> findCommentairesByLivreId(int livreId);
}
