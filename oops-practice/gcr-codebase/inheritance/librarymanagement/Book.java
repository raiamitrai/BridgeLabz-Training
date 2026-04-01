package OOPs.inheritance.librarymanagement;

public class Book {
    private String title;
    private String publicationYear;

    public Book(String title, String publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getPublicationYear() {
        return publicationYear;
    }
}
