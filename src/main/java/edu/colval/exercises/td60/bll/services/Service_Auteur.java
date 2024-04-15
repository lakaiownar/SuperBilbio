package edu.colval.exercises.td60.bll.services;

import edu.colval.exercises.td60.bll.model.Auteur;
import edu.colval.exercises.td60.dal.Repository_Auteur;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Auteur save(Auteur auteur) {
        repositoryAuteur.save(auteur);
        return auteur;
    }

    public Auteur getAuteurById(int id) {
        return repositoryAuteur.findById(id).get();
    }

    public Auteur getAuteurReponse() {
        Auteur auteur = new Auteur();
        auteur.setName("John");
        auteur.setLastname("Doe");
        auteur.setBiography("Test");
        return auteur;
    }

    public List<Auteur> findByNameAndLastnameOrderByNameAscLastnameAsc(String name, String lastname) {
        return repositoryAuteur.findByNameAndLastnameOrderByNameAscLastnameAsc(name, lastname);
    }
}
