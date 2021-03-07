package com.example.bookservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {
    Database database = new Database();

    @GetMapping("/all")
    public List<author> findAll() {
        return database.getAuthorArrayList();
    }

    @GetMapping("/{id}")
    public author findById(@PathVariable long id) {
        for (int i = 0; i < database.getAuthorArrayList().size(); i++) {
            if (database.getAuthorArrayList().get(i).getId() == (id)) {
                return database.getAuthorArrayList().get(i);
            }
        }
        return null;
    }

    @PostMapping
    public void save(@RequestBody author author) {
        database.setAuthorArrayList(author);
    }

    @DeleteMapping("/all")
    public void deleteAll() {
        int temp = database.getAuthorArrayList().size();
        for (int i = 0; i < temp; i++) {
            database.getAuthorArrayList().remove(i);
            temp = database.getAuthorArrayList().size();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable long id) {
        database.getAuthorArrayList().remove(findById(id));
    }

    @PutMapping("/{id}")
    public void update(@PathVariable long id, @RequestBody author author){
        author toUpdateAuthor = findById(id);
        toUpdateAuthor.setId(author.getId());
        toUpdateAuthor.setName(author.getName());
        toUpdateAuthor.setBookAmount(author.getBookAmount());
    }
}
