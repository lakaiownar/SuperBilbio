package edu.colval.exercises.td60.rest;

import edu.colval.exercises.td60.bll.model.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class RestTemplate {

    @Autowired
    RestTemplate restTemplate;

    @Bean
    public RestTemplate restTemplate() {
        return new org.springframework.web.client.RestTemplate();
    }

    @PostMapping("/books")
    public List<Livre> getBooks() {
        String url = "http://superbiblio.com/api/";
        ResponseEntity<List<Livre>> response = restTemplate.exchange(url, HttpMethod.GET, null, new ParameterizedTypeReference<List<Livre>>() {});
        return response.getBody();
    }
}
