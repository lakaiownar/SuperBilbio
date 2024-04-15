//package edu.colval.exercises.td60.rest;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.core.ParameterizedTypeReference;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.reactive.function.client.WebClient;
//import reactor.core.publisher.Mono;
//
//import java.awt.print.Book;
//import java.util.List;
//
//@RestController
//public class WebClientTest {
//
//    @Autowired
//    private WebClient.Builder webClientBuilder;
//
//    @Bean
//    public WebClient.Builder webClientBuilder() {
//        return WebClient.builder();
//    }
//
//    @PostMapping("/books")
//    public Mono<List<Book>> getBooks() {
//        return webClientBuilder.build()
//                .get()
//                .uri("http://superbiblio.com/api/books")
//                .retrieve()
//                .bodyToMono(new ParameterizedTypeReference<List<Book>>() {});
//    }
//}
