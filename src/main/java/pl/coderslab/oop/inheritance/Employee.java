package pl.coderslab.oop.inheritance;

public class Employee {
    public int id;
    public String name;
    public String surname;
    public double wage;

    public Employee(int id, String name, String surname, double wage) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.wage = wage;
    }

    public void raiseWage(int percent){
        if(percent >0){
            this.wage = ((wage/100)*percent)+this.wage;
            System.out.println("wage changed");
        } else {
            System.out.println("error number");
        }
    }


}
