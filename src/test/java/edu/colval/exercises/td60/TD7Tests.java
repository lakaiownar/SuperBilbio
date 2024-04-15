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
public class TD7Tests {

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
        
    }
}