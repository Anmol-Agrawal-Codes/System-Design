package IteratorPattern.WithIteratorPattern;

public class ClientV2 {
    public static void main(String[] args) {
        BookCollectionV2 bookCollection = new BookCollectionV2();
        
        bookCollection.addBook(new Book("b1", "a1", 1));
        bookCollection.addBook(new Book("b2", "a2", 2));
        bookCollection.addBook(new Book("b4", "a4", 4));
        bookCollection.addBook(new Book("b3", "a3", 3));
        

        java.util.Iterator<Book> iterator = bookCollection.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
