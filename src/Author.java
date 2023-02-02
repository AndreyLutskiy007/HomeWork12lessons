import java.util.Objects;

public class Author {
    private String nameAuthor;
    private String surNameAuthor;

    public Author(String nameAuthor, String surNameAuthor) {
        this.nameAuthor = nameAuthor;
        this.surNameAuthor = surNameAuthor;
    }

    public String getNameAuthor() {
        return this.nameAuthor;
    }

    public String getSurNameAuthor() {
        return this.surNameAuthor;
    }

    public void setSurNameAuthor(String surNameAuthor) {
        this.surNameAuthor = surNameAuthor;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (this == obj) return true;
        if (!obj.getClass().equals(Author.class)) return false;
        Author other = (Author) obj;
        return Objects.equals(this.nameAuthor, other.nameAuthor)
                && Objects.equals(this.surNameAuthor, other.surNameAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.nameAuthor, this.surNameAuthor);
    }

    @Override
    public String toString() {
        return this.nameAuthor + " " + this.surNameAuthor;
    }
}
