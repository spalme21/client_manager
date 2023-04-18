
import java.util.ArrayList;
import java.util.Random;
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

    /**
     * Generate a new, unique ID for a user
     * @return  the ID
     */
    public String getNewUserId() {
        
        // inits
        String id;
        Random rng = new Random();
        int len = 6;
        boolean nonUnique;

        // loop until we get a unique number
        do {

            // generate the number
            id = "";
            for (int i = 0; i < len; i++) {
                id += ((Integer)rng.nextInt(10)).toString();
            }

            // check if it's unique
            nonUnique = false;
            for (User u : this.users) {
                if (id.compareTo(u.getUserID()) == 0) {
                    nonUnique = true;
                    break;
                }
            }
        } while (nonUnique);

        return id;

    }

}