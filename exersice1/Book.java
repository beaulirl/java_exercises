import java.util.Arrays;

/**
 * Created by Admin on 12.10.2016.
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
        return "Book{" +
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

}
