package com.example.bookservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class author {
    private long id;
    private String Name;
    private int bookAmount;

    public long getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public int getBookAmount() {
        return bookAmount;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setBookAmount(int bookAmount) {
        this.bookAmount = bookAmount;
    }
}
