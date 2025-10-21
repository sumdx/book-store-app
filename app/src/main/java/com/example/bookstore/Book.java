package com.example.bookstore;

public class Book {
    String name,title, author, description;
    int coverImageResource;
    double price;
    boolean availability;

    public Book(String name, String title, String author, String description, int coverImageResource, double price, boolean availability) {
        this.name = name;
        this.title = title;
        this.author = author;
        this.description = description;
        this.coverImageResource = coverImageResource;
        this.price = price;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getCoverImageResource() {
        return coverImageResource;
    }

    public void setCoverImageResource(int coverImageResource) {
        this.coverImageResource = coverImageResource;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }
}
