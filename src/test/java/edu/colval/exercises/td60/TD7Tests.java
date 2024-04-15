package edu.colval.exercises.td60;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class TD7Tests {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testRequestParam() throws Exception {
    mockMvc.perform(MockMvcRequestBuilders.get("/auteur")
            .param("nom", "Test"))
            .andExpect(status().isOk());
    }

    @Test
    public void testPathVariable() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/auteur/{auteur_id}", 1))
                .andExpect(status().isOk());
    }

    @Test
    public void testRequestHeaderAndRequestBody() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/auteur")
                .header(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .content("{\"name\":\"Test\",\"lastname\":\"Test\",\"biography\":\"Test\"}"))
                .andExpect(status().isOk());
    }

    @Test
    public void testRequestEntityAndResponseEntity() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/auteurReponse"))
                .andExpect(status().isOk());
    }
}