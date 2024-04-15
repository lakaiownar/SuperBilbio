package edu.colval.exercises.td60.bll.services;

import edu.colval.exercises.td60.bll.model.Reservations;
import edu.colval.exercises.td60.dal.Repository_Reservations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_Reservations {
    @Autowired
    private Repository_Reservations repositoryReservations;

    public Repository_Reservations getRepositoryReservations() {
        return repositoryReservations;
    }

    public void setRepositoryReservations(Repository_Reservations repositoryReservations) {
        this.repositoryReservations = repositoryReservations;
    }

    public void save(Reservations reservations) {
        repositoryReservations.save(reservations);
    }

    public List<Reservations> getReservations() {
        return repositoryReservations.findAll();
    }

    public List<Reservations> findReservationsByLivreId(int livreId) {
        return repositoryReservations.findReservationsByLivreId(livreId);
    }
}
