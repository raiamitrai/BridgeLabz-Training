package OOPs.constructors.librarybookingsystem;

import java.sql.SQLOutput;

public class BorrowBook {

    void  borrowBook(Book book){
        if (book.isAvailable()){
            book.setAvailable(false);
            System.out.printf("Book Borrow Successfully");
        }
        else{
            System.out.println("Book is already borrowed");
        }
    }
}
