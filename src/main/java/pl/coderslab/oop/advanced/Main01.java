package pl.coderslab.oop.advanced;

import pl.coderslab.oop.inheritance.AdvanceCalculator;

import static pl.coderslab.oop.inheritance.AdvanceCalculator.globalOperations;

public class Main01 {

    public static void main(String[] args) {


        AdvanceCalculator advanceCalculator = new AdvanceCalculator();

        advanceCalculator.pow(2,10);
        advanceCalculator.root(10,5);
        advanceCalculator.pow(10,5);
        advanceCalculator.pow(5,5);
        advanceCalculator.pow(1,5);
        advanceCalculator.pow(2,5);
        advanceCalculator.printGlobalOperations();
        System.out.println(globalOperations.length);
        System.out.println("--------");
        advanceCalculator.printGlobalOperations(2);
    }
}
