package com.example.bookservice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {
    private Database database = new Database();

    public List<library> findAll() {
        return database.getLibraryArrayList();
    }

    public library findById(long id) {
        for (int i = 0; i < database.getLibraryArrayList().size(); i++) {
            if (database.getLibraryArrayList().get(i).getId() == (id)) {
                return database.getLibraryArrayList().get(i);
            }
        }
        return null;
    }

    public void save(library library) {
        database.setLibraryArrayList(library);
    }

    public void deleteAll() {
        database.getLibraryArrayList().clear();
    }

    public void deleteByID(long id) {
        database.getLibraryArrayList().remove(findById(id));
    }

    public void update(long id, library library) {
        library toUpdateLibrary = findById(id);
        toUpdateLibrary.setId(library.getId());
        toUpdateLibrary.setLocation(library.getLocation());
        toUpdateLibrary.setAmountOfBooks(library.getAmountOfBooks());
    }
}
