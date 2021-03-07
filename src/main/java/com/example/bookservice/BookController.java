package com.example.bookservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    // GET localhost:8080/books/all - returns all books
    // GET localhost:8080/books/2 - return book by id
    // POST localhost:8080/books - save new book
    // DELETE localhost:8080/books/2 - delete the book
    // PUT localhost:8080/books/1 - update the book
    Database database = new Database();

    @GetMapping("/all")
    public List<book> findAll() {
        return database.getBookArrayList();
    }

    @GetMapping("/{id}")
    public book findById(@PathVariable Long id) {
        for (int i = 0; i < database.getBookArrayList().size(); i++) {
            if (database.getBookArrayList().get(i).getId() == (id)) {
                return database.getBookArrayList().get(i);
            }
        }
        return null;
    }

    @PostMapping
    public void save(@RequestBody book book) {
        database.setBookArrayList(book);
    }

    @PostMapping("/all")
    public void deleteAll() {
        int temp = database.getBookArrayList().size();
        for (int i = 0; i < temp; i++) {
            database.getBookArrayList().remove(i);
            temp = database.getBookArrayList().size();
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        database.getBookArrayList().remove(findById(id));
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody book book) {
        book toUpdateBook = findById(id);
        toUpdateBook.setId(book.getId());
        toUpdateBook.setTitle(book.getTitle());
        toUpdateBook.setYear(book.getYear());
    }

}
