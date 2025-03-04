package digitalLibrary;

abstract class Book {
    private String title;
    private String isbn;
    private Author author;
    private Publisher publisher;

    public Book(String title, String isbn, Author author, Publisher publisher) {
        this.title = title;
        this.isbn = isbn;
        this.author = author;
        this.publisher = publisher;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    // Abstract method to be implemented by subclasses
    public abstract String getFormat();

    @Override
    public String toString() {
        return "Title: " + title + ", ISBN: " + isbn +
                "\n" + author.toString() +
                "\n" + publisher.toString() +
                "\nFormat: " + getFormat();
    }
}
