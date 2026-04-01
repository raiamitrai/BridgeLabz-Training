package OOPs.encapsulation.librerymanagementsystem;

abstract class LibraryItem {

    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public void getItemDetails() {
        System.out.println(itemId + " | " + title + " | " + author);
    }

    public abstract int getLoanDuration();
}

