package FifthExercise;

/**
 * Created by Admin on 09.11.2016.
 */
public class Author {

    private String name;
    private String email;
    private char gender;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Author author = (Author) o;

        if (gender != author.gender) return false;
        if (name != null ? !name.equals(author.name) : author.name != null) return false;
        return email != null ? email.equals(author.email) : author.email == null;

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (int) gender;
        return result;
    }
}