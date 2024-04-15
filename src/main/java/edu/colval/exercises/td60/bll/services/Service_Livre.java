package edu.colval.exercises.td60;

import edu.colval.exercises.td60.bll.model.Livre;
import edu.colval.exercises.td60.dal.Repository_Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service_Livre {
    @Autowired
    private Repository_Livre repositoryLivre;

    public Repository_Livre getRepositoryLivre() {
        return repositoryLivre;
    }

    public void setRepositoryLivre(Repository_Livre repositoryLivre) {
        this.repositoryLivre = repositoryLivre;
    }

    public boolean saveLivre(Livre livre) {
        repositoryLivre.save(livre);
        return true;
    }
}
