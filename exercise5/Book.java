package FifthExercise;

import java.util.Arrays;

/**
 * Created by Admin on 09.11.2016.
 */
public class Book {

    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price){
        this.setPrice(price);
        this.authors = authors;
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public Author[] getAuthors(){
        return this.authors;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty(){
        return this.qty;
    }

    public void setQty(int qty){
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "FirstExercise.Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getAuthorNames(){
        String s = "";
        for(int i = 0; i < this.authors.length; i++){
            s = s + " " + this.authors[i].getName();
        }
        return s;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (Double.compare(book.price, price) != 0) return false;
        if (qty != book.qty) return false;
        if (name != null ? !name.equals(book.name) : book.name != null) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(authors, book.authors);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(authors);
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + qty;
        return result;
    }
}