
import java.util.ArrayList;
public class Library {
    
    /**
     * The name of the library.
     */
    private String name;

    /**
     * The list of users.
     */
    private ArrayList<User> users;

    /**
     * The list of books.
     */
    private ArrayList<Book> books;

    /**
     * The list of authors.
     */
    private ArrayList<Author> authors;

    /** 
     * Create a new Library object with empty list of users, books and authors.
     * @param name  the name of the library
     */
    public Library(String name) {

        this.name = name;

        this.users = new ArrayList<User>();
        this.books = new ArrayList<Book>();
        this.authors = new ArrayList<Author>();

    }

    // TODO: GetNewUserId()

}