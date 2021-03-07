package com.example.bookservice;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libraries")
public class LibraryController {
    Database database = new Database();

    @GetMapping("/all")
    public List<library> findAll() {
        return database.getLibraryArrayList();
    }

    @GetMapping("/{id}")
    public library findById(@PathVariable long id) {
        for (int i = 0; i < database.getLibraryArrayList().size(); i++) {
            if (database.getLibraryArrayList().get(i).getId() == (id)) {
                return database.getLibraryArrayList().get(i);
            }
        }
        return null;
    }

    @PostMapping
    public void save(@RequestBody library library) {
        database.setLibraryArrayList(library);
    }

    @DeleteMapping("/all")
    public void deleteAll() {
        int temp = database.getLibraryArrayList().size();
        for (int i = 0; i < temp; i++) {
            database.getLibraryArrayList().remove(i);
            temp = database.getLibraryArrayList().size();
        }
    }

    @DeleteMapping("/{id}")
    public void deleteByID(@PathVariable long id) {
        database.getLibraryArrayList().remove(findById(id));
    }

    @PutMapping("/{id}")
    public void update(@PathVariable long id, @RequestBody library library){
        library toUpdateLibrary = findById(id);
        toUpdateLibrary.setId(library.getId());
        toUpdateLibrary.setLocation(library.getLocation());
        toUpdateLibrary.setAmountOfBooks(library.getAmountOfBooks());
    }
}
