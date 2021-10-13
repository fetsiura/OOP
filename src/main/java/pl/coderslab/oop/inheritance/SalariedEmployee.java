package pl.coderslab.oop.inheritance;

public class SalariedEmployee extends  Employee{

    final static int hours = 190;
    public SalariedEmployee(int id, String name, String surname, double wage) {
        super(id, name, surname, wage);
    }


    public double calculatePayment(){
        return this.wage * hours;
    }
}
