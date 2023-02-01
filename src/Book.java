public class Book {
    private String bookName;
    private int bookAge;
    private String author;

    public Book(String bookName, int bookAge, String author) {
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

    public String getAuthor() {
        return this.author;
    }
}
