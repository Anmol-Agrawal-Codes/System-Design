package IteratorPattern.WithIteratorPattern;

public class Client {
    public static void main(String[] args) {
        BookCollection bookCollection = new BookCollection();
        
        bookCollection.addBook(new Book("b1", "a1", 1));
        bookCollection.addBook(new Book("b2", "a2", 2));
        bookCollection.addBook(new Book("b3", "a3", 3));
        bookCollection.addBook(new Book("b4", "a4", 4));
        

        Iterator<Book> iterator = bookCollection.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

/*
 * ITERATOR PATTERN - CODE STORY
 *
 * Problem:
 * Imagine a library application that stores books internally using an ArrayList.
 * Today it's an ArrayList, but tomorrow it could become a LinkedList, HashSet,
 * database, or even a remote API.
 *
 * Without the Iterator Pattern, every client would need to know HOW the books
 * are stored and write traversal logic like:
 *
 *      for (int i = 0; i < collection.size(); i++) { ... }
 *
 * If the internal data structure changes, every client must also change.
 * This tightly couples the client to the collection's implementation.
 *
 * Solution:
 * The Iterator Pattern hides the traversal logic behind a common interface.
 * Clients only ask for an iterator and never care how the collection stores
 * or retrieves its elements.
 *
 * 1. BookCollection owns the books and decides how they are stored internally.
 *
 * 2. BookCollection creates a BookIterator, which knows how to traverse the
 *    collection one element at a time.
 *
 * 3. The Client never accesses the internal List directly. It simply uses
 *    hasNext() and next() to iterate through the collection.
 *
 * 4. If tomorrow the collection changes from ArrayList to LinkedList, Set,
 *    Tree, or even a database query, only BookCollection and BookIterator
 *    need to change. The client code remains exactly the same.
 *
 * Data Flow:
 *
 *      Client
 *         |
 *         | createIterator()
 *         v
 *   BookCollection (Aggregate)
 *         |
 *         | creates
 *         v
 *   BookIterator (Iterator)
 *         |
 *         | hasNext() / next()
 *         v
 *      Book objects
 *
 * Key Design Idea:
 * - Aggregate (BookCollection): Owns the data.
 * - Iterator (BookIterator): Knows HOW to traverse the data.
 * - Client: Knows only HOW to use the iterator, never HOW the data is stored.
 *
 * Benefits:
 * - Hides the internal representation of the collection.
 * - Decouples traversal logic from the collection.
 * - Client code remains unchanged if the underlying data structure changes.
 * - Supports multiple independent iterators over the same collection.
 * - Follows the Single Responsibility Principle by separating storage from traversal.
 *
 * Think of it like watching a playlist on Spotify:
 * - Spotify stores songs however it wants (database, cache, cloud, etc.).
 * - You simply press "Next" to get the next song.
 * - You never need to know where the songs are stored or how they are fetched.
 */