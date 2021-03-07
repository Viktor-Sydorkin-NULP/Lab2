package com.example.bookservice;

import java.util.ArrayList;

public class Database {
    private ArrayList<book> bookArrayList =  new ArrayList<>();
    private ArrayList<author> authorArrayList =  new ArrayList<>();
    private ArrayList<library> libraryArrayList =  new ArrayList<>();

    public Database() {
        bookArrayList.add(new book(1, "The Cat in the Hat", 2009));
        bookArrayList.add(new book(2, "Life After Death: A Novel", 2021));
        bookArrayList.add(new book(3, "Oh, the Places You'll Go!  ", 1990));
        bookArrayList.add(new book(4, "Green Eggs and Ham", 1960));
        bookArrayList.add(new book(5, "One Fish Two Fish Red Fish Blue Fish", 1960));
        bookArrayList.add(new book(6, "Beyond Order: 12 More Rules for Life", 2021));
        bookArrayList.add(new book(7, "Later", 2021));
        bookArrayList.add(new book(8, "The Four Winds: A Novel", 2021));
        bookArrayList.add(new book(9, "They Both Die at the End", 2018));
        bookArrayList.add(new book(10, "Atomic Habits: An Easy & Proven Way to Build Good Habits & Break Bad Ones", 2018));

        authorArrayList.add(new author(1, "James", 11));
        authorArrayList.add(new author(2, "John", 7));
        authorArrayList.add(new author(3, "Robert", 9));
        authorArrayList.add(new author(4, "Michael", 23));
        authorArrayList.add(new author(5, "William", 3));
        authorArrayList.add(new author(6, "David", 17));
        authorArrayList.add(new author(7, "Richard", 45));
        authorArrayList.add(new author(8, "Joseph", 2));
        authorArrayList.add(new author(9, "Thomas", 28));
        authorArrayList.add(new author(10, "Charles", 1));

        libraryArrayList.add(new library(1, "New York", 50000));
        libraryArrayList.add(new library(2, "Los Angeles", 40000));
        libraryArrayList.add(new library(3, "Chicago", 40000));
        libraryArrayList.add(new library(4, "Houston", 30000));
        libraryArrayList.add(new library(5, "Phoenix", 60000));
        libraryArrayList.add(new library(6, "Philadelphia", 70000));
        libraryArrayList.add(new library(7, "San Antonio", 20000));
        libraryArrayList.add(new library(8, "San Diego", 50000));
        libraryArrayList.add(new library(9, "Dallas", 450000));
        libraryArrayList.add(new library(10, "San Jose", 55000));
    }

    public void setBookArrayList(book book) {
        bookArrayList.add(book);
    }

    public ArrayList<book> getBookArrayList() {
        return bookArrayList;
    }

    public ArrayList<author> getAuthorArrayList() {
        return authorArrayList;
    }

    public ArrayList<library> getLibraryArrayList() {
        return libraryArrayList;
    }

    public void setAuthorArrayList(author author) {
        authorArrayList.add(author);
    }

    public void setLibraryArrayList(library library) {
        libraryArrayList.add(library);
    }
}
