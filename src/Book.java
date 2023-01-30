public class Book {
    private String bookName;
    private int bookAge;

    public Book(String bookName, int bookAge) {
        this.bookName = bookName;
        this.bookAge = bookAge;
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

}
