package com.example.bookstore;

public class Book {
    String title, author, description;
    int coverImageResource;
    double price;
    String availability;
    double review;


    public Book(String title, String author, String description, int coverImageResource, double price, String availability, double review) {
        this.title = title;
        this.author = author;
        this.description = description;
        this.coverImageResource = coverImageResource;
        this.price = price;
        this.availability = availability;
        this.review = review;
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

    public String getAvailability() {
        if(availability.equalsIgnoreCase("available") || availability.equalsIgnoreCase("instock") ){
            return "In Stock";
        }else {

            return "Not Available";
        }

    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public double getReview() {
        return review;
    }

    public void setReview(double review) {
        this.review = review;
    }
}
