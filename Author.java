
import java.util.ArrayList;

public class Author {

    /**
     * The first name of the author.
     */
    private String firstName;

    /**
     * The last name of the author.
     */
    private String lastName;

    /**
     * The list of books written by the author.
     */
    private ArrayList<Book> books;
    
    /**
     * Create a new author
     * @param firstName the first name of the author
     * @param lastName  the last name of the author
     */
    public Author(String firstName, String lastName) {

        // set the name of the author
        this.firstName = firstName;
        this.lastName = lastName;

        // create an empty list of books.
        this.books = new ArrayList<Book>();

    }

    /**
     * Add a book to the list of books written by the author.
     * @param book  a book written by the author
     */
    public void addBook(Book book) {

        this.books.add(book);

    }
}