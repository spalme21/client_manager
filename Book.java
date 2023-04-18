
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
    private Author author;

    /**
     * The ISBN number of the book.
     */
    private String isbn;

    /**
     * The status of the book
     */
    private Status status;
    
    /**
     * Create a new book
     * @param title     the title of the book
     * @param author    the author of the book
     * @param isbn      the ISBN of the book
     */
    public Book(String title, Author author, String isbn) {

        this.title = title;
        this.author = author;
        this.isbn = isbn;

        // Always initialize status to available
        this.status = Status.AVAILABLE;

        // Add book to the author's list of books.
        author.addBook(this);

    }
}