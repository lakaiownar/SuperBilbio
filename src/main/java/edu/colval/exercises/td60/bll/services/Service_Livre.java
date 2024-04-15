package edu.colval.exercises.td60.bll.services;

import edu.colval.exercises.td60.bll.model.Livre;
import edu.colval.exercises.td60.dal.Repository_Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public void save(Livre livre) {
        repositoryLivre.save(livre);
    }

    public Livre findById(int id) {
        return repositoryLivre.findById(id).orElse(null);
    }
    public List<Livre> findLivreByTitreOrderByTitreAsc(String name) {
        return repositoryLivre.findLivreByTitreOrderByTitreAsc(name);
    }

    public Livre findLivreByTitre (String titre) {
        return repositoryLivre.findLivreByTitre(titre);
    }
}
