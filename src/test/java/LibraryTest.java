import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book;

    @Before
    public void before(){
        book = new Book("title", "author", "genre");
        library = new Library(2);
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canCountBooks(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.bookCount());
    }

    @Test
    public void canAddBookIfStockIsFull(){
        library.addBook(book);
        library.addBook(book);
        assertEquals(false, library.checkStock());
    }

}
