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
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Chris");
        System.out.println(person1.getName());
        System.out.println(person2.getName());

    }
}
