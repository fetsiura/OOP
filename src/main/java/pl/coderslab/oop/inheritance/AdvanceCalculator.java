package pl.coderslab.oop.inheritance;

import pl.coderslab.oop.constructor.Calculator;

import java.util.Arrays;

public class AdvanceCalculator extends Calculator {

    public static final double PI = 3.14159265;

    public static String [] globalOperations = new String[0];

    public double pow(double num1, double num2) {
        addToGlobalHistory(num1+" ^ "+num2+" equals "+ Math.pow(num1,num2));
        return Math.pow(num1,num2);
    }

    public double root(double num1, double num2) {
        addToGlobalHistory(num1+" root of "+num2+" equals "+ Math.pow(num1, 1 / num2));
        return Math.pow(num1, 1 / num2);
    }




    public void addToGlobalHistory(String str ){

        globalOperations = Arrays.copyOf(globalOperations,globalOperations.length+1);

            globalOperations[globalOperations.length-1] = str;
            System.out.println("Operation added to global history");
    }

    public static double computeCircleArea( double r){
        return PI*r*r;
    }

    public static void printGlobalOperations(){
        for (String operation : globalOperations){
            System.out.println(operation);
        }
    }

    public static void printGlobalOperations(int length){
        try {
            for (int i=globalOperations.length-length - 1; i<globalOperations.length-1; i++) {
                System.out.println(globalOperations[i]);;
            } } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("nie było tyle operacji");
        }
    }
}


