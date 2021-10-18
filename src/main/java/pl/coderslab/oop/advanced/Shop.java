package pl.coderslab.oop.advanced;

public class Shop {
    public static void main(String[] args) {


        ShoppingCart cart = new ShoppingCart();


        cart.printReceipt();
        Product Milk = new Product("Milk", 2.5);
        Product Bread = new Product("Bread", 5);
        Product Sugar = new Product("Sugar", 10);

        cart.addProduct(Milk,2);
        cart.addProduct(Bread,1);
        cart.addProduct(Sugar,3);
        cart.printReceipt();
        cart.getTotalQuantity();
        cart.removeProduct(Milk);

        cart.printReceipt();
        cart.getTotalQuantity();

        cart.updateProduct(Milk,4);
        cart.printReceipt();
        cart.getTotalQuantity();

        cart.getTotalSum();
        cart.printReceipt();
        cart.removeProduct(Milk);

        cart.printReceipt();
        cart.getTotalSum();




    }
}
