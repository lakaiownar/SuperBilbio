package edu.colval.exercises.td60.dal;

import edu.colval.exercises.td60.bll.model.Utilisateurs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repository_Utilisateurs extends JpaRepository<Utilisateurs, Integer>{
    Utilisateurs findByEmail(String email);
}
