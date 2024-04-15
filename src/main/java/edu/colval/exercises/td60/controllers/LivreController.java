package edu.colval.exercises.td60.controllers;

import edu.colval.exercises.td60.bll.model.Livre;
import edu.colval.exercises.td60.bll.services.Service_Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LivreController {
    @Autowired
    private Service_Livre livreService;

    // localhost:8080/livres
     @GetMapping("/livres")
     public List<Livre> getLivres() {
         return livreService.getRepositoryLivre().findAll();
     }

    // localhost:8080/livre?titre=Gone Girl
    @GetMapping("/livre")
    public List<Livre> findLivreByTitre(@RequestParam(name = "titre") String titre) {
        return livreService.getRepositoryLivre().findLivreByTitreOrderByTitreAsc(titre);
    }
}
