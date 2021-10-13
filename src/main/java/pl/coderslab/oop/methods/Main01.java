package pl.coderslab.oop.methods;

public class Main01 {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("Jaro");
        person.setSurname("Majer");
        person.setAge(22);
        person.setGender('M');

        System.out.println(person.getFullName());


    }
}
