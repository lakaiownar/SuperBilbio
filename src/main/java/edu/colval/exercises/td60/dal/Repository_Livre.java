package edu.colval.exercises.td60.dal;

import edu.colval.exercises.td60.bll.model.Livre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repository_Livre extends JpaRepository<Livre, Integer> {
    List<Livre> findLivreByTitreOrderByTitreAsc(String name);

    Livre findLivreByTitre(String titre);
}
