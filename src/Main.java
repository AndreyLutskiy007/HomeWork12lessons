import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        book1();
        book2();
    }

    public static void book1() {
        Author author = new Author("Лев", "Толстой");
        Author author2 = new Author("Лев", "Толстой");
        Book warAndPeace = new Book("Война и Мир", 1866, author);
        System.out.println("author equals itself " + author.equals(author));
        System.out.println("author equals author2 " + author.equals(author2));
        System.out.println("author equals string " + author.equals(""));
        System.out.println("author equals null " + author.equals(null));
        System.out.println("author hash code " + author.hashCode());
        System.out.println("book hash code " + warAndPeace.hashCode());
        System.out.println("warAndPeace.getBookName = " + warAndPeace.getBookName());
        System.out.println(author);
        System.out.println("warAndPeace.getAuthor().getNameAuthor() = " + warAndPeace.getAuthor().getNameAuthor());
        System.out.println("warAndPeace.getAuthor().getSurNameAuthor() = " + warAndPeace.getAuthor().getSurNameAuthor());
        System.out.println("warAndPeace.getBookAge() = " + warAndPeace.getBookAge());
        warAndPeace.setBookAge(1867);
        System.out.println("warAndPeace.getBookAge() = " + warAndPeace.getBookAge());
        System.out.println(warAndPeace);
    }

    public static void book2() {
        Author author = new Author("Джон", "Толкин");
        Author author3 = new Author("Джон", "Толкин");
        Book hobbit = new Book("Хоббит", 1938, author);
        System.out.println("author equals itself " + author.equals(author));
        System.out.println("author equals author3 " + author.equals(author3));
        System.out.println("author equals string " + author.equals(""));
        System.out.println("author equals null " + author.equals(null));
        System.out.println("author hash code " + author.hashCode());
        System.out.println("book hash code " + hobbit.hashCode());
        System.out.println("hobbit.getBookName() = " + hobbit.getBookName());
        System.out.println("hobbit.getAuthor().getNameAuthor() = " + hobbit.getAuthor().getNameAuthor());
        System.out.println("hobbit.getAuthor().getSurNameAuthor() = " + hobbit.getAuthor().getSurNameAuthor());
        System.out.println("hobbit.getBookAge() = " + hobbit.getBookAge());
        hobbit.setBookAge(1937);
        System.out.println("hobbit.getBookAge() = " + hobbit.getBookAge());
        System.out.println(hobbit);
    }
}



