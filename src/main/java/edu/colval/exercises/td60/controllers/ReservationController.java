package edu.colval.exercises.td60.controllers;

import edu.colval.exercises.td60.bll.model.Livre;
import edu.colval.exercises.td60.bll.model.Reservations;
import edu.colval.exercises.td60.bll.services.Service_Livre;
import edu.colval.exercises.td60.bll.services.Service_Reservations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ReservationController {
    @Autowired
    private Service_Reservations reservationService;
    @Autowired
    private Service_Livre livreService;

    @GetMapping("/reservations")
    public List<Reservations> getReservations() {
        return reservationService.getReservations();
    }

    // localhost:8080/reservations/livre?titre=Étranger
    @GetMapping("/reservations/livre")
    public List<Reservations> getReservationsByLivre(@RequestParam(name = "titre") String titre) {
        Livre livre = livreService.getRepositoryLivre().findLivreByTitre(titre);
        if (livre != null) {
            return reservationService.getRepositoryReservations().findReservationsByLivreId(livre.getLivreId());
        } else {
            return new ArrayList<>();
        }
    }
}
