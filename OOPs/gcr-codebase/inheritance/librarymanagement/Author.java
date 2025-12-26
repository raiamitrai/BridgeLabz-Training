package OOPs.inheritance.librarymanagement;

public class Author extends Book{
     private String name;
     private String bio;

    public Author(String title, String publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }
}
