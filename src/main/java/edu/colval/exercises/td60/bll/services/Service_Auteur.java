package edu.colval.exercises.td60;

import edu.colval.exercises.td60.bll.model.Auteur;
import edu.colval.exercises.td60.dal.Repository_Auteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service_Auteur {
    @Autowired
    private Repository_Auteur repositoryAuteur;

    public Repository_Auteur getRepositoryAuteur() {
        return repositoryAuteur;
    }

    public void setRepositoryAuteur(Repository_Auteur repositoryAuteur) {
        this.repositoryAuteur = repositoryAuteur;
    }

    public boolean saveAuteur(Auteur auteur) {
        repositoryAuteur.save(auteur);
        return true;
    }
}
