package dsa.linkedlist.moviemanagementsystem;

public class Main {
    public static void main(String[] args) {

        MovieManagementSystem movies = new MovieManagementSystem();

        movies.addAtEnd("Inception", "Christopher Nolan", 2010, 8.8);
        movies.addAtEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        movies.addAtBeginning("Titanic", "James Cameron", 1997, 7.9);

        movies.displayForward();

        System.out.println("\nSearch by Director:");
        movies.searchByDirector("Christopher Nolan");

        System.out.println("\nUpdate Rating:");
        movies.updateRating("Titanic", 8.2);

        System.out.println("\nRemove Movie:");
        movies.removeByTitle("Interstellar");

        movies.displayForward();
        movies.displayReverse();
    }
}

