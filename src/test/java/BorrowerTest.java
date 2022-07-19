import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower borrower;
    private Book book;
    private Library library;

    @Before
    public void before(){
        borrower = new Borrower("Dave");
        book = new Book("title1", "author1", "genre1");
        library = new Library(2);
        library.addBook(book);
    }

    @Test
    public void borrowedBooksStartEmpty(){
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void canBorrowBook(){
        borrower.borrowBookFromLibrary(library);
        assertEquals(0, library.bookCount());
    }


}
