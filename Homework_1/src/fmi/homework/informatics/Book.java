package fmi.homework.informatics;

public class Book {
    private String title;
    private String author;
    private String publishers;
    private int yearPublishing;
    private int isbn;

    public Book(String title, String author, String publishers, int yearPublishing, int isbn) {
        this.title = title;
        this.author = author;
        this.publishers = publishers;
        this.yearPublishing = yearPublishing;
        this.isbn = isbn;
    }

    public Book() {

    }

    public String toString() {

        return title + "," + author + "," + publishers +
                "," + yearPublishing + "," + isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishers() {
        return publishers;
    }

    public void setPublishers(String publishers) {
        this.publishers = publishers;
    }

    public int getYearPublishing() {
        return yearPublishing;
    }

    public void setYearPublishing(int yearPublishing) {
        this.yearPublishing = yearPublishing;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
}
