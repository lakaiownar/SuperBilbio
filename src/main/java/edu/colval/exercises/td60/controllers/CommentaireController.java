package edu.colval.exercises.td60.controllers;

import edu.colval.exercises.td60.bll.model.Commentaires;
import edu.colval.exercises.td60.bll.model.Livre;
import edu.colval.exercises.td60.bll.services.Service_Commentaires;
import edu.colval.exercises.td60.bll.services.Service_Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentaireController {
    @Autowired
    private Service_Commentaires commentaireService;

    @Autowired
    private Service_Livre livreService;

    // localhost:8080/commentaires
    @GetMapping("/commentaires")
    public String getCommentaires() {
        return commentaireService.getRepositoryCommentaires().findAll().toString();
    }

    // localhost:8080/commentaires/livre?titre=Étranger
    @GetMapping("/commentaires/livre")
    public List<Commentaires> findCommentairesByLivre(@RequestParam String titre) {
        Livre livre = livreService.getRepositoryLivre().findLivreByTitre(titre);
        if (livre != null) {
            return commentaireService.getRepositoryCommentaires().findCommentairesByLivreId(livre.getLivreId());
        } else {
            return null;
        }
    }
}
