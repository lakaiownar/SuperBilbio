package edu.colval.exercises.td60.rest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.print.Book;
import java.util.List;

@FeignClient(name = "SuperBiblio", url = "http://superbiblio.com")
public interface OpenFeign {
    @GetMapping("/api/books")
    List<Book> getBooks();
}