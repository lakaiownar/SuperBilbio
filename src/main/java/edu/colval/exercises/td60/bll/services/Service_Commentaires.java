package edu.colval.exercises.td60.bll.services;

import edu.colval.exercises.td60.bll.model.Commentaires;
import edu.colval.exercises.td60.bll.model.Livre;
import edu.colval.exercises.td60.dal.Repository_Commentaires;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_Commentaires {
    @Autowired
    private Repository_Commentaires repositoryCommentaires;

    public Repository_Commentaires getRepositoryCommentaires() {
        return repositoryCommentaires;
    }

    public void setRepositoryCommentaires(Repository_Commentaires repositoryCommentaires) {
        this.repositoryCommentaires = repositoryCommentaires;
    }

    public void save(Commentaires commentaires) {
        repositoryCommentaires.save(commentaires);
    }

    public List<Commentaires> findCommentairesByLivreId(int livreId) {
        return repositoryCommentaires.findCommentairesByLivreId(livreId);
    }
}