package pl.coderslab.oop.constructor;

public class Main01 {

    public static void main(String[] args) {


        Calculator calculator = new Calculator();
        calculator.printOperations();
        calculator.add(5,3);
        calculator.printOperations();
        calculator.clearOperations();
        calculator.printOperations();


    }
}
