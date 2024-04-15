package edu.colval.exercises.td60.controllers;

import edu.colval.exercises.td60.bll.model.Utilisateurs;
import edu.colval.exercises.td60.bll.services.Service_Utilisateurs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UtilisateurController {
    @Autowired
    private Service_Utilisateurs utilisateurService;

    @GetMapping("/utilisateurs")
    public List<Utilisateurs> getAllUtilisateurs() {
        return utilisateurService.getRepositoryUtilisateurs().findAll();
    }

    // localhost:8080/utilisateurs/email?email=alice@example.com
    @GetMapping("/utilisateurs/email")
    public Utilisateurs getUtilisateurByEmail(String email) {
        return utilisateurService.getRepositoryUtilisateurs().findByEmail(email);
    }

    // localhost:8080/utilisateurs/
    // {
    //     "nom": "Alice",
    //     "prenom": "Wonderland",
    //     "email": "12345@colval.qc.ca",
    //     "motDePasseHashed": "1Ab@2222cde",
    //     "role": "Admin"
    // }
    @PostMapping("/utilisateurs")
    public ResponseEntity<Utilisateurs> createUtilisateur(@RequestBody Utilisateurs utilisateur) {
        Utilisateurs savedUtilisateur = utilisateurService.getRepositoryUtilisateurs().save(utilisateur);
        return new ResponseEntity<>(savedUtilisateur, HttpStatus.CREATED);
    }
}
