package edu.colval.exercises.td60.bll.services;

import edu.colval.exercises.td60.bll.model.Utilisateurs;
import edu.colval.exercises.td60.dal.Repository_Utilisateurs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service_Utilisateurs {
    @Autowired
    private Repository_Utilisateurs repositoryUtilisateurs;

    public Repository_Utilisateurs getRepositoryUtilisateurs() {
        return repositoryUtilisateurs;
    }

    public void setRepositoryUtilisateurs(Repository_Utilisateurs repositoryUtilisateurs) {
        this.repositoryUtilisateurs = repositoryUtilisateurs;
    }

    public void save(Utilisateurs utilisateurs) {
        repositoryUtilisateurs.save(utilisateurs);
    }
}