
enum Status {
    AVAILABLE,
    CHECKED_OUT,
    OVERDUE;
}

public class Book {
    
    /**
     * The title of the book.
     */
    private String title;

    /**
     * The author of the book.
     */
    private String author;

    /**
     * The ISBN number of the book.
     */
    private String isbn;

    /**
     * The genre of the book.
     */
    private String genre;

    /**
     * A brief summary of the book.
     */
    private String summary;

    /**
     * The status of the book
     */
    private Status status;
    
}