package reflection.retrieveannotationsatruntime;

public class Main {
    public static void main(String[] args) {

        //class object
        Class<?> cls = Book.class;

        // Annotation retrieve
        Author author = cls.getAnnotation(Author.class);

        if(author != null){
            System.out.println("Author Name :- " + author.name());
        }
    }
}
