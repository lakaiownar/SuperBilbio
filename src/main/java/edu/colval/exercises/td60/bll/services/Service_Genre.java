package edu.colval.exercises.td60.bll.services;

import edu.colval.exercises.td60.bll.model.Genre;
import edu.colval.exercises.td60.dal.Repository_Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service_Genre {
    @Autowired
    private Repository_Genre repositoryGenre;

    public Repository_Genre getRepositoryGenre() {
        return repositoryGenre;
    }

    public void setRepositoryGenre(Repository_Genre repositoryGenre) {
        this.repositoryGenre = repositoryGenre;
    }

    public void save(Genre genre) {
        repositoryGenre.save(genre);
    }
}
