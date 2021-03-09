package com.example.controllers;

import com.example.data.Library;
import com.example.services.LibraryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libraries")
public class LibraryController {
    private LibraryService libraryService = new LibraryService();

    @GetMapping("/all")
    public List<Library> findAll() {
        return libraryService.findAll();
    }

    @GetMapping("/{id}")
    public Library findById(@PathVariable long id) {
        return libraryService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody Library library) {
        libraryService.save(library);
    }

    @DeleteMapping("/all")
    public void deleteAll() {
        libraryService.deleteAll();
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable long id) {
        libraryService.deleteByID(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable long id, @RequestBody Library library) {
        libraryService.update(id, library);
    }
}
