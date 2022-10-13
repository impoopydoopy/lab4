public class Book {
    private final String name;
    private final String author;
    private final int year;
    private int quantity;
    private double price;

    Book(String n, String a, int y, int q, int p)
    {
        name = n;
        author = a;

        if(y > 0 && y < 2022) year = y;
        else year = 2022;

        if(q > 0) quantity = q;
        else q = 0;

        if(p > 0) price = p;
        else p = 0;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }


    public void setQuantity(int q) {
        if(q > 0) quantity = q;
        else q = 0;
    }

    public int getQuantity() {
        return quantity;
    }


    public void setPriceToQuantity(double primaryPrice)
    {
        if(primaryPrice < 0) primaryPrice = 0;
        price = primaryPrice - quantity*0.01;
    }

    public double getPrice() {
        return price;
    }

    public double getSum()
    {
        return quantity*price;
    }
}
