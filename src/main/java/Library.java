import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;
    public Library(int capacity) {
        this.books = new ArrayList<>();
        this.capacity = capacity;
    }
    public void addBook(Book book) {
        this.books.add(book);
    }

    public int bookCount() {
        return this.books.size();
    }

    public boolean checkStock() {
        if (this.books.size() >= capacity){
            return false;
        }
        else {return true;}
        }

    public Book removeBook() {
        return this.books.remove(0);
    }
}
