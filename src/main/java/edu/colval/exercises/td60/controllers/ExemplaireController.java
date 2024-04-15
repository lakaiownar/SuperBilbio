package edu.colval.exercises.td60.controllers;

import edu.colval.exercises.td60.bll.model.Exemplaires;
import edu.colval.exercises.td60.bll.services.Service_Exemplaires;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExemplaireController {
    @Autowired
    private Service_Exemplaires exemplaireService;

    // localhost:8080/exemplaires
    @GetMapping("/exemplaires")
    public List<Exemplaires> getExemplaires() {
        return exemplaireService.getRepositoryExemplaires().findAll();
    }
}
