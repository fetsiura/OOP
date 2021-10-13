package pl.coderslab.oop.inheritance;

import pl.coderslab.oop.constructor.Calculator;

import java.util.Arrays;

public class AdvanceCalculator extends Calculator {

    static String [] globalOperations = new String[0];

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
    }
