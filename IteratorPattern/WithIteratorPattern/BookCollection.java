package IteratorPattern.WithIteratorPattern;

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

    public Iterator<Book> createIterator(){
        return new BookIterator(books);
    }

    private class BookIterator implements Iterator<Book>{

        List<Book> books;
        int pos = 0;
        public BookIterator(List<Book> books){
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return pos < books.size();
        }

        @Override
        public Book next() {
            return books.get(pos++);
        }
    }
}
