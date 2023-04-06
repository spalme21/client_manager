
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


}