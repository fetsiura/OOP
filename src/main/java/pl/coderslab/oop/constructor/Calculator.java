package pl.coderslab.oop.constructor;

import java.util.Arrays;

public class Calculator {

    String[] operationHistory= new String[0];


    public void addHistory (String str){
        operationHistory= Arrays.copyOf(operationHistory,operationHistory.length+1);
        operationHistory[operationHistory.length-1] = str;
        System.out.println("Operation added");
    }

    public double add(double num1, double num2){
        addHistory("added "+num1+" to "+num2+" got "+ (num1+num2));
        return num1+num2;
    }
    public double multiply(double num1, double num2){
        addHistory("multiply "+num1+" to "+num2+" got "+ (num1*num2));
        return num1*num2;
    }
    public double subtract(double num1, double num2){
        addHistory("subtract "+num1+" to "+num2+" got "+ (num1-num2));
        return num1-num2;
    }
    public double divide(double num1, double num2){
        if(num2 != 0){
            addHistory("divide "+num1+" to "+num2+" got "+ (num1/num2));
            return num1/num2;
        }
        return 0.0;
    }

    public void printOperations(){
        if(operationHistory.length ==0){
            System.out.println("is empty");
        } else {
            System.out.println("HISTORY_____________");
            for (String val : operationHistory) {
                System.out.println(val);
            }
        }
    }

    public void clearOperations(){
        operationHistory = new String[0];
    }
}
