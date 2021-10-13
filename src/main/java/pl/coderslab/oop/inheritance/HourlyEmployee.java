package pl.coderslab.oop.inheritance;

public class HourlyEmployee extends Employee{
    public HourlyEmployee(int id, String name, String surname, double wage) {
        super(id, name, surname, wage);
    }

    public double calculatePayment (int hours){

        return hours *  this.wage;
    }
}
