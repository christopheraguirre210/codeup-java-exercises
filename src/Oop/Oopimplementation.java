package Oop;

public class Oopimplementation {
    public static void main(String[] args) {
        Person rick = new Person();
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";
        System.out.println(rick.sayHello());
        // prints "Hello from Rick Sanchez!"

        System.out.println(Person.eatsFood);

        Person chris = new Person();
        chris.firstName = "Chris";
        chris.lastName = "Aggie";
        System.out.println(chris.sayHello());
    }
}
