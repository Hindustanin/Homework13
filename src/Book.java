import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publication == book.publication && Objects.equals(title, book.title) && Objects.equals(author, book.author);
    }

    @Override
    public String toString() {
        return "Книга: 1" + title +
                ", Автор: " + author +
                ", Дата публикации: " + publication;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, publication);
    }
}
