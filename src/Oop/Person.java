package Oop;

public class Person {
        public String firstName;
        public String lastName;
        public static boolean eatsFood = true;

        public String sayHello() {
            return String.format("Hello from %s %s!", firstName, lastName);
        }


}
