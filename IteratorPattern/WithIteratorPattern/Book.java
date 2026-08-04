package IteratorPattern.WithIteratorPattern;

public class Book {
    String title;
    private String author;
    private int price;

    public Book(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Book(" + title + ", " + author + ", " + price + ")";
    }
}
