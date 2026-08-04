package IteratorPattern.WithoutIteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private List<Book> books;

    public BookCollection(){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }

    public Book getBook(int idx){
        return books.get(idx);
    }

    public int size(){
        return books.size();
    }
}
