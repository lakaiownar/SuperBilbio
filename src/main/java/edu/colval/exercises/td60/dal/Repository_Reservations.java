package edu.colval.exercises.td60.dal;

import edu.colval.exercises.td60.bll.model.Reservations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Repository_Reservations extends JpaRepository<Reservations, Integer>{
    List<Reservations> findAll();

    List<Reservations> findReservationsByLivreId(int livreId);
}