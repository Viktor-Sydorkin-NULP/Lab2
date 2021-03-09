package com.example.data;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Library {
    private long id;
    private String location;
    private int amountOfBooks;
}

