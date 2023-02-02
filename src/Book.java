import java.util.Objects;

public class Book {
    private String bookName;
    private int bookAge;
    private Author author;

    public Book(String bookName, int bookAge, Author author) {
        this.bookName = bookName;
        this.bookAge = bookAge;
        this.author = author;

    }

    public String getBookName() {
        return this.bookName;
    }

    public int getBookAge() {
        return this.bookAge;
    }

    public void setBookAge(int bookAge) {
        this.bookAge = bookAge;
    }

    public Author getAuthor() {
        return this.author;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null) return false;
        if (this == object) return true;
        if (!object.getClass().equals(Book.class)) return false;
        Book other = (Book) object;
        return Objects.equals(this.bookName, other.bookName) &&
                Objects.equals(this.bookAge, other.bookAge) &&
                Objects.equals(this.author, other.author);

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.bookName, this.bookAge, author);
    }

    @Override
    public String toString() {
        return "Наименование книги: " + this.bookName + ", автор: " + author + ", год издания " + this.bookAge;
    }
}
