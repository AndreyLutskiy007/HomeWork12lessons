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
}
