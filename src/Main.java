public class Main {

    public static void main(String[]args) {
        book1();
        book2();
    }
    public static void book1(){

        Book warAndPeace = new Book("Война и Мир", 1866);
        System.out.println("warAndPeace.bookName = " + warAndPeace.getBookName());
        System.out.println("warAndPeace.bookAge = " + warAndPeace.getBookAge());
        warAndPeace.setBookAge(1867);
        System.out.println("warAndPeace.getBookAge() = " + warAndPeace.getBookAge());
        Author authorNames = new Author("Лев", "Толстй");
        System.out.println("authorNames.surNameAuthor = " + authorNames.getSurNameAuthor());
        authorNames.setNameAuthor("Толстой");
        System.out.println("authorNames.nameAuthor = " + authorNames.getNameAuthor());
    }
    public static void book2() {
            Book hobbit = new Book("Хоббит", 1938);
            Author authorHobbit = new Author("Джон", "Толкин");
            System.out.println("hobbit.getBookName() = " + hobbit.getBookName());
            System.out.println("hobbit.getBookAge() = " + hobbit.getBookAge());
            hobbit.setBookAge(1937);
            System.out.println("hobbit.getBookAge() = " + hobbit.getBookAge());
            System.out.println("authorHobbit.getNameAuthor() = " + authorHobbit.getNameAuthor());
            System.out.println("authorHobbit.getSurNameAuthor() = " + authorHobbit.getSurNameAuthor());
        }
    }



