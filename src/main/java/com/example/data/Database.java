package com.example.data;

import java.util.ArrayList;

public class Database {
    private ArrayList<Book> bookArrayList =  new ArrayList<>();
    private ArrayList<Author> authorArrayList =  new ArrayList<>();
    private ArrayList<Library> libraryArrayList =  new ArrayList<>();

    public Database() {
        bookArrayList.add(new Book(1, "The Cat in the Hat", 2009));
        bookArrayList.add(new Book(2, "Life After Death: A Novel", 2021));
        bookArrayList.add(new Book(3, "Oh, the Places You'll Go!  ", 1990));
        bookArrayList.add(new Book(4, "Green Eggs and Ham", 1960));
        bookArrayList.add(new Book(5, "One Fish Two Fish Red Fish Blue Fish", 1960));
        bookArrayList.add(new Book(6, "Beyond Order: 12 More Rules for Life", 2021));
        bookArrayList.add(new Book(7, "Later", 2021));
        bookArrayList.add(new Book(8, "The Four Winds: A Novel", 2021));
        bookArrayList.add(new Book(9, "They Both Die at the End", 2018));
        bookArrayList.add(new Book(10, "Atomic Habits: An Easy & Proven Way to Build Good Habits & Break Bad Ones", 2018));

        authorArrayList.add(new Author(1, "James", 11));
        authorArrayList.add(new Author(2, "John", 7));
        authorArrayList.add(new Author(3, "Robert", 9));
        authorArrayList.add(new Author(4, "Michael", 23));
        authorArrayList.add(new Author(5, "William", 3));
        authorArrayList.add(new Author(6, "David", 17));
        authorArrayList.add(new Author(7, "Richard", 45));
        authorArrayList.add(new Author(8, "Joseph", 2));
        authorArrayList.add(new Author(9, "Thomas", 28));
        authorArrayList.add(new Author(10, "Charles", 1));

        libraryArrayList.add(new Library(1, "New York", 50000));
        libraryArrayList.add(new Library(2, "Los Angeles", 40000));
        libraryArrayList.add(new Library(3, "Chicago", 40000));
        libraryArrayList.add(new Library(4, "Houston", 30000));
        libraryArrayList.add(new Library(5, "Phoenix", 60000));
        libraryArrayList.add(new Library(6, "Philadelphia", 70000));
        libraryArrayList.add(new Library(7, "San Antonio", 20000));
        libraryArrayList.add(new Library(8, "San Diego", 50000));
        libraryArrayList.add(new Library(9, "Dallas", 450000));
        libraryArrayList.add(new Library(10, "San Jose", 55000));
    }

    public void setBookArrayList(Book book) {
        bookArrayList.add(book);
    }

    public ArrayList<Book> getBookArrayList() {
        return bookArrayList;
    }

    public ArrayList<Author> getAuthorArrayList() {
        return authorArrayList;
    }

    public ArrayList<Library> getLibraryArrayList() {
        return libraryArrayList;
    }

    public void setAuthorArrayList(Author author) {
        authorArrayList.add(author);
    }

    public void setLibraryArrayList(Library library) {
        libraryArrayList.add(library);
    }
}
