package edu.colval.exercises.td60.dal;

import edu.colval.exercises.td60.bll.model.Auteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repository_Auteur extends JpaRepository<Auteur, Integer>{
    Auteur findByName(String name);

    List<Auteur> findByNameAndLastnameOrderByNameAscLastnameAsc(String name, String lastname);
}
