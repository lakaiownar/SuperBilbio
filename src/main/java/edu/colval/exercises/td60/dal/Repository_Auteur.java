package edu.colval.exercises.td60.bll.dal;

import edu.colval.exercises.td60.bll.model.Auteur;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repository_Auteur extends CrudRepository<Auteur, Integer>{
}
