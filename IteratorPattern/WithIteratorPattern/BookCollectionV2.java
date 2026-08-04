package IteratorPattern.WithIteratorPattern;

import java.util.ArrayList;
import java.util.List;

public class BookCollectionV2 implements Iterable<Book> {
    private List<Book> books;

    public BookCollectionV2(){
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

    @Override
    public java.util.Iterator<Book> iterator() {
        return books.iterator();
    }
}

