package com.example.services;

import com.example.data.Author;
import com.example.data.Database;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    private Database database = new Database();

    public List<Author> findAll() {
        return database.getAuthorArrayList();
    }

    public Author findById(long id) {
        for (int i = 0; i < database.getAuthorArrayList().size(); i++) {
            if (database.getAuthorArrayList().get(i).getId() == (id)) {
                return database.getAuthorArrayList().get(i);
            }
        }
        return null;
    }

    public void save(Author author) {
        database.setAuthorArrayList(author);
    }

    public void deleteAll() {
        database.getAuthorArrayList().clear();
    }

    public void deleteByID(long id) {
        database.getAuthorArrayList().remove(findById(id));
    }

    public void update(long id, Author author) {
        Author toUpdateAuthor = findById(id);
        toUpdateAuthor.setId(author.getId());
        toUpdateAuthor.setName(author.getName());
        toUpdateAuthor.setBookAmount(author.getBookAmount());
    }
}
