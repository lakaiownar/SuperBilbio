package edu.colval.exercises.td60.bll.services;

import edu.colval.exercises.td60.bll.model.Exemplaires;
import edu.colval.exercises.td60.dal.Repository_Exemplaires;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service_Exemplaires {
    @Autowired
    private Repository_Exemplaires repositoryExemplaires;

    public Repository_Exemplaires getRepositoryExemplaires() {
        return repositoryExemplaires;
    }

    public void setRepositoryExemplaires(Repository_Exemplaires repositoryExemplaires) {
        this.repositoryExemplaires = repositoryExemplaires;
    }

    public void save(Exemplaires exemplaires) {
        repositoryExemplaires.save(exemplaires);
    }
}
