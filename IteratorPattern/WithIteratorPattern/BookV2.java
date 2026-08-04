package IteratorPattern.WithIteratorPattern;

public class BookV2 implements Comparable<Book> {
    private String title;
    private String author;
    private int price;

    public BookV2(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Book(" + title + ", " + author + ", " + price + ")";
    }

    @Override
    public int compareTo(Book o) {
        return this.title.compareTo(author)
    }
}
