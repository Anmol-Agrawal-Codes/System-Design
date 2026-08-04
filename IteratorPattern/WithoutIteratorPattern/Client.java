package IteratorPattern.WithoutIteratorPattern;

public class Client {

    public static void main(String[] args) {   
        BookCollection booksCollection = new BookCollection();
        
        booksCollection.addBook(new Book("b1", "a1", 1));
        booksCollection.addBook(new Book("b2", "a2", 1));
        booksCollection.addBook(new Book("b3", "a3", 1));

        for(int i = 0; i < booksCollection.size(); i++){
            System.out.println(booksCollection.getBook(i));
        }
    }
}


// Every time client code must be aware about how to traverse the collections.