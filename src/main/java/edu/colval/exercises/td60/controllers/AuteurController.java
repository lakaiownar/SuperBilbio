package edu.colval.exercises.td60.controllers;

import edu.colval.exercises.td60.bll.model.Auteur;
import edu.colval.exercises.td60.bll.services.Service_Auteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuteurController {
    @Autowired
    private Service_Auteur auteurService;

    // localhost:8080/auteurs
    @GetMapping("/auteurs")
    public List<Auteur> getAuteurs() {
        return auteurService.getRepositoryAuteur().findAll();
    }

    // localhost:8080/auteur?nom=john
    @GetMapping("/auteur")
    public Auteur getAuteur(@RequestParam(name = "nom") String nom) {
        return auteurService.getRepositoryAuteur().findByName(nom);
    }

    // localhost:8080/auteur/1
    @GetMapping("/auteur/{auteur_id}")
    public Auteur getAuteurById(@PathVariable(name = "auteur_id") int id) {
        return auteurService.getRepositoryAuteur().findById(id).get();
    }

    // localhost:8080/auteur
    // POST
    // {
    //     "name": "test"
    //     "lastname": "test"
    //     "biography": "test"
    // }
    @PostMapping("/auteur")
    public Auteur createAuteur(@RequestBody Auteur newAuteur) {
    return auteurService.save(newAuteur);
    }

    @GetMapping("/auteurReponse")
    public Auteur getAuteurReponse() {
        return auteurService.getAuteurReponse();
    }

    // localhost:8080/auteurByNameAndLastname?name=John&lastname=Doe
    @GetMapping("/auteurByNameAndLastname")
    public List<Auteur> findByNameAndLastname(@RequestParam(name = "name") String name, @RequestParam(name = "lastname") String lastname) {
        return auteurService.getRepositoryAuteur().findByNameAndLastnameOrderByNameAscLastnameAsc(name, lastname);
    }
}
