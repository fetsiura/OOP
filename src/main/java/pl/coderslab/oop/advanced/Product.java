package pl.coderslab.oop.advanced;

public class Product {

    private int id;
    private String name;
    private double price;
    private int nextId =1;


    public Product(String name, double price) {
        this.id = nextId;
        nextId++;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(this.price < 0.01) {
            System.out.println("error price");
        } else {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
