public class Oopimplementation {
    public static void main(String[] args) {


//        Person chris = new Person("Chris");
//        System.out.println(chris.sayHello());

//        Person person1 = new Person("Chris");
//        Person person2 = new Person("Michelle");
//
//        System.out.println(person1.getFirstName().equals(person2.getFirstName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("Michelle");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

        Person person1 = new Person("Michelle");
        Person person2 = person1;
        System.out.println(person1.getFirstName());
        System.out.println(person2.getFirstName());
        person2.setFirstName("Chris");
        System.out.println(person1.getFirstName());
        System.out.println(person2.getFirstName());

    }
}
