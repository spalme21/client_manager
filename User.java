
import java.util.ArrayList;
import java.security.MessageDigest;

public class User {

    /**
     * The first name of the user.
     */
    private String firstName;

    /**
     * The last name of the user.
     */
    private String lastName;

    /**
     * The ID number for the user.
     */
    private String userId;

    /**
     * The MD5 hash of the user's pin number.
     */
    private byte pinHash[];

    /**
     * The list of books the user has checked out.
     */
    private ArrayList<Book> checkedOutBooks;

    /**
     * Create a new user
     * @param firstName the user's first name
     * @param lastName  the user's last name
     * @param pin       the user's account pin number
     * @param library   the Library object the user is a member of
     */
    public User(String firstName, String lastName, String pin, Library library) {

        // set user's name
        this.firstName = firstName;
        this.lastName = lastName;

        // store the pin's MD5 hash
        MessageDigest md = MessageDigest.getInstance("MD5");
        this.pinHash = md.digest(pin.getBytes());

        // get a new id for the user
        this.userId = library.getNewUserId();
        
        // create an empty list of books
        this.books = new ArrayList<Book>();

        // print log message
        System.out.printf(
            "New user %s, %s with ID %s created.",
            lastName,
            firstName,
            this.userId
        );

    }
}