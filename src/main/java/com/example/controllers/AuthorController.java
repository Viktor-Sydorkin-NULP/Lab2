package com.example.controllers;

import com.example.data.Author;
import com.example.services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping("/all")
    public List<Author> findAll() {
        return authorService.findAll();
    }

    @GetMapping("/{id}")
    public Author findById(@PathVariable long id) {
        return authorService.findById(id);
    }


    @PostMapping
    public void save(@RequestBody Author author) {
        authorService.save(author);
    }

    @DeleteMapping("/all")
    public void deleteAll() {
        authorService.deleteAll();
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable long id) {
        authorService.deleteByID(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable long id, @RequestBody Author author) {
        authorService.update(id, author);
    }
}
