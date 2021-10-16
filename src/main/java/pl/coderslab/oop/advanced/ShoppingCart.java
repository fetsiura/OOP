package pl.coderslab.oop.advanced;

import java.util.Arrays;

public class ShoppingCart {
    public CartItem [] cartItems=new CartItem[0];

    public void addProduct( Product product, int quantity) {
        CartItem item = new CartItem();
        item.setProduct(product);
        item.setQuantity(quantity);
        cartItems = Arrays.copyOf(cartItems, cartItems.length +1 );
        cartItems[cartItems.length- 1] = item;
    }

    public void printReceipt(){

            int counter = 1;
            for ( CartItem item : cartItems){

                if(item.getQuantity()!=0){

                System.out.println(counter+": "+ item.getProduct().getName() +", "+item.getQuantity()+"x"+item.getProduct().getPrice()+
                        " = "+item.getQuantity()*item.getProduct().getPrice());
                counter++;
                }
            }
        System.out.println("---------------");


    }

    public void removeProduct(Product product){

        for (CartItem item : cartItems){
            if(item.getProduct().equals(product)){
                item.setQuantity(0);
            }
        }
    }

    public void updateProduct(Product product, int quantity){

        for (CartItem item : cartItems){
            if(item.getProduct().equals(product)){
                item.setQuantity(quantity);
            }
        }
    }

    public void getTotalQuantity (){
        int counter = 0;

        for (CartItem cartItem : cartItems){
            if(cartItem.getQuantity() != 0){
                counter++;
            }
        }

        System.out.println("Products quantity :"+counter);

    }

    public void getTotalSum(){
        int counter = 0;

        for ( CartItem item : cartItems){

            if(item.getQuantity()!=0){

                counter+=item.getProduct().getPrice()*item.getQuantity();
            }
        }

        System.out.println("Total sum is :"+counter);

    }
}
