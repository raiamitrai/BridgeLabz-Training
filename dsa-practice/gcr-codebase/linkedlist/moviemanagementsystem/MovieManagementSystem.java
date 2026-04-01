package dsa.linkedlist.moviemanagementsystem;


public class MovieManagementSystem {

    MovieNode head;
    MovieNode tail;

    // 1️⃣ Add at Beginning
    public void addAtBeginning(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // 2️⃣ Add at End
    public void addAtEnd(String title, String director, int year, double rating) {
        MovieNode newNode = new MovieNode(title, director, year, rating);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // 3️⃣ Add at Specific Position (1-based)
    public void addAtPosition(String title, String director, int year, double rating, int position) {
        if (position == 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }

        MovieNode temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
            return;
        }

        MovieNode newNode = new MovieNode(title, director, year, rating);
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // 4️⃣ Remove by Movie Title
    public void removeByTitle(String title) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {

                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                }
                else if (temp == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                }
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                System.out.println("Movie removed: " + title);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    // 5️⃣ Search by Director
    public void searchByDirector(String director) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                printMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movies found for director: " + director);
    }

    // 6️⃣ Search by Rating
    public void searchByRating(double rating) {
        MovieNode temp = head;
        boolean found = false;

        while (temp != null) {
            if (temp.rating >= rating) {
                printMovie(temp);
                found = true;
            }
            temp = temp.next;
        }

        if (!found)
            System.out.println("No movies found with rating >= " + rating);
    }

    // 7️⃣ Update Rating by Title
    public void updateRating(String title, double newRating) {
        MovieNode temp = head;

        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                System.out.println("Rating updated for " + title);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    // 8️⃣ Display Forward
    public void displayForward() {
        System.out.println("\nMovies (Forward):");
        MovieNode temp = head;
        while (temp != null) {
            printMovie(temp);
            temp = temp.next;
        }
    }

    // 9️⃣ Display Reverse
    public void displayReverse() {
        System.out.println("\nMovies (Reverse):");
        MovieNode temp = tail;
        while (temp != null) {
            printMovie(temp);
            temp = temp.prev;
        }
    }

    // Helper Method
    private void printMovie(MovieNode m) {
        System.out.println(
                "Title: " + m.title +
                        ", Director: " + m.director +
                        ", Year: " + m.year +
                        ", Rating: " + m.rating
        );
    }
}

