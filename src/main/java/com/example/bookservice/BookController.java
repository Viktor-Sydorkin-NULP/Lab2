package com.example.bookservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/all")
    public List<book> findAll() {
        return bookService.findAll();
    }

    @GetMapping("/{id}")
    public book findById(@PathVariable Long id) {
        return bookService.findById(id);
    }

    @PostMapping
    public void save(@RequestBody book book) {
        bookService.save(book);
    }

    @PostMapping("/all")
    public void deleteAll() {
        bookService.deleteAll();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        bookService.delete(id);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody book book) {
        bookService.update(id, book);
    }
}
