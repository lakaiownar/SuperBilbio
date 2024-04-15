package edu.colval.exercises.td60.dal;

import edu.colval.exercises.td60.bll.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repository_Genre extends JpaRepository<Genre, Integer>{
}
