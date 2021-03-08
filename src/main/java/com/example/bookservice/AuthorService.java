package com.example.bookservice;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private Database database = new Database();

    public List<author> findAll() {
        return database.getAuthorArrayList();
    }

    public author findById(long id) {
        for (int i = 0; i < database.getAuthorArrayList().size(); i++) {
            if (database.getAuthorArrayList().get(i).getId() == (id)) {
                return database.getAuthorArrayList().get(i);
            }
        }
        return null;
    }

    public void save(author author) {
        database.setAuthorArrayList(author);
    }

    public void deleteAll() {
        database.getAuthorArrayList().clear();
    }

    public void deleteByID(long id) {
        database.getAuthorArrayList().remove(findById(id));
    }

    public void update(long id, author author) {
        author toUpdateAuthor = findById(id);
        toUpdateAuthor.setId(author.getId());
        toUpdateAuthor.setName(author.getName());
        toUpdateAuthor.setBookAmount(author.getBookAmount());
    }
}
