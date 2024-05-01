//package edu.colval.exercises.td60;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//import edu.colval.exercises.td60.bll.model.Utilisateurs;
//import jakarta.transaction.Transactional;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.http.MediaType;
//import org.springframework.test.web.servlet.MockMvc;
//
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
//
//@SpringBootTest
//@AutoConfigureMockMvc
//public class TD8Tests {
//
//    @Autowired
//    private MockMvc mockMvc;
//
//    @Autowired
//    private ObjectMapper objectMapper;
//
//    @Test
//    @Transactional
//    public void testCreateUtilisateur() throws Exception {
//        Utilisateurs utilisateur = new Utilisateurs();
//        utilisateur.setNom("Alice");
//        utilisateur.setPrenom("Wonderland");
//        utilisateur.setEmail("12345@colval.qc.ca");
//        utilisateur.setMotDePasseHashed("1Ab@2222cde");
//        utilisateur.setRole("Admin");
//
//        String json = objectMapper.writeValueAsString(utilisateur);
//
//        mockMvc.perform(post("/utilisateurs")
//                .contentType(MediaType.APPLICATION_JSON)
//                .content(json))
//                .andExpect(status().isCreated());
//    }
//}