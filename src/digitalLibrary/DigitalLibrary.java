package digitalLibrary;

import java.util.ArrayList;

public class DigitalLibrary {
    private String name;
    private ArrayList<Book> books;

    public DigitalLibrary(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added book: " + book.getTitle());
    }

    public void removeBook(Book book) {
        System.out.println("Removing book: " + book.getTitle());
    }


    public static void main(String[] args) {
        DigitalLibrary library = new DigitalLibrary("Mubas Digital Library");

        Author author1 = new Author("Mark Mwanavina", "Bangula, Nsanje");
        Author author2 = new Author("Madalitso Mwanavina", "Bangula, Nsanje");

        Publisher publisher1 = new Publisher("Claim Mabuku", "Zomba");
        Publisher publisher2 = new Publisher("Jhango Books", "Nsanje");

        HardCopyBook book1 = new HardCopyBook(
                "Java Programming",
                "9780141439518",
                author1,
                publisher1,
                416,
                "Paperback"
        );
        SoftCopyBook book2 = new SoftCopyBook(
                "Java Programming",
                "9780141439518",
                author2,
                publisher2,
                "PDF",
                50.4
        );
        library.addBook(book1);
        library.addBook(book2);
        System.out.println(library);
    }
}