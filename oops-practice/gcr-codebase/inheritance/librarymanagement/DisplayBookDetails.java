package OOPs.inheritance.librarymanagement;

public class DisplayBookDetails {

    public void displayInfo(Book book){
        System.out.println("Book Title       : " + book.getTitle());
        System.out.println("Publication Year : " + book.getPublicationYear());


        if(book instanceof Author){
            Author author = (Author) book;
            System.out.println("Author Name       : " + author.getName());
            System.out.println("Author Bio        : " + author.getBio());
        }
    }

}
