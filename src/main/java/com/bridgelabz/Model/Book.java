package com.bridgelabz.Model;


import javax.persistence.*;

@Entity
public class Book {

    @Id
    private String id;
    private String author;
    private String nameOfBook;
    private String picByte;
    private String Price;
    @Column(length = 2000)
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getPicByte() {
        return picByte;
    }

    public void setPicByte(String picByte) {
        this.picByte = picByte;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", author='" + author + '\'' +
                ", nameOfBook='" + nameOfBook + '\'' +
                ", picByte=" + picByte +
                ", price=" + Price +
                ", description='" + description + '\'' +
                '}';
    }

}
