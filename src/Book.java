public class Book {
    private String title;
    private Author author;
    private int publication;

    public Book(String title, Author author, int publication) {
        this.title = title;
        this.author = author;
        this.publication = publication;
    }
    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublication() {
        return this.publication;
    }

    public void setPublication(int publication) {
        this.publication = publication;
    }
}
