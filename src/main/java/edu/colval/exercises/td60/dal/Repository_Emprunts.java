package edu.colval.exercises.td60.dal;

import edu.colval.exercises.td60.bll.model.Emprunts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repository_Emprunts extends JpaRepository<Emprunts, Integer>{
}
