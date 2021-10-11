package pl.coderslab.oop.attributes;

public class Main02 {

    public static void main(String[] args) {
        AccessModifier testAttribute = new AccessModifier();
        testAttribute.protectedAttribute = 10;
        testAttribute.publicAttribute = 2000;

        System.out.println(testAttribute.protectedAttribute);
        System.out.println(testAttribute.publicAttribute);

    }
}
