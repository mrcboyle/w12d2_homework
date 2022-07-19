import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowed;

    public Borrower(String name){
        this.borrowed = new ArrayList<Book>();
        this.name= name;
    }

    public int bookCount(){
        return borrowed.size();
    }

    public void borrowBookFromLibrary(Library library) {
        Book book = library.removeBook();
        this.borrowed.add(book);
    }
}
