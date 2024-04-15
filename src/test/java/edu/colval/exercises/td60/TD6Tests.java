package edu.colval.exercises.td60;

import edu.colval.exercises.td60.bll.model.Auteur;
import edu.colval.exercises.td60.bll.model.Genre;
import edu.colval.exercises.td60.bll.model.Livre;
import edu.colval.exercises.td60.bll.services.Service_Auteur;
import edu.colval.exercises.td60.bll.services.Service_Genre;
import edu.colval.exercises.td60.bll.services.Service_Livre;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TD6Tests {

    @Autowired
    private Service_Livre livreService;

    @Autowired
    private Service_Auteur auteurService;

    @Autowired
    private Service_Genre genreService;

    @Test
    @Transactional
    // Transactional annotation is required to avoid LazyInitializationException
    public void testCreateAndFindLivre() {
        // Find and printout basic info of first found auteur
        List<Auteur> auteurs = auteurService.getRepositoryAuteur().findAll();
        if (!auteurs.isEmpty()) {
            Auteur auteur = auteurs.get(0);
            System.out.println("Auteur: " + auteur.getName() + " " + auteur.getLastname());
        }
        else {
            System.out.println("No auteurs found");
        }

        // Find and printout basic info of first found genre
        List<Genre> genres = genreService.getRepositoryGenre().findAll();
        if (!genres.isEmpty()) {
            Genre genre = genres.get(0);
            System.out.println("Genre: " + genre.getNom());
        }
        else {
            System.out.println("No genres found");
        }

        // Find a book and it's information
        List<Livre> livres = livreService.getRepositoryLivre().findAll();
        if (!livres.isEmpty()) {
            Livre livre = livres.get(0);
            System.out.println("Livre: " + livre.getTitre() + " " + livre.getAuteur().getName() + " " + livre.getGenre().getNom());
        }
        else {
            System.out.println("No livres found");
        }

        // CRUD operations
        // Create a new Book
        Livre livre2 = new Livre();
        livre2.setTitre("Test");
        livre2.setAuteur(auteurService.getRepositoryAuteur().findAll().get(0));
        livre2.setGenre(genreService.getRepositoryGenre().findAll().get(0));
//        livreService.getRepositoryLivre().save(livre2);

        // Create a new Auteur
        Auteur auteur2 = new Auteur();
        auteur2.setName("Test");
        auteur2.setLastname("Test");
//        auteurService.getRepositoryAuteur().save(auteur2);
    }
}