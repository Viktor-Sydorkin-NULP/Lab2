package com.example.bookservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class library {
    private long id;
    private String location;
    private int amountOfBooks;

    public long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public int getAmountOfBooks() {
        return amountOfBooks;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setAmountOfBooks(int amountOfBooks) {
        this.amountOfBooks = amountOfBooks;
    }
}

