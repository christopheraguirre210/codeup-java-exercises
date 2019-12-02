
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {


//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

//        String[] Person = {"Chris", "Michelle", "Riley"};
//
//        for(int i = 0; i < Person.length; i++){
//            System.out.println(Person[i]);
//        }




        Person[] people = new Person[3];
        people[0] = new Person("Chris");
        people[1] = new Person("Michelle");
        people[2] = new Person("Riley");

        for (Person person : people) {
            System.out.println(person.firstName);
        }

       people = addPerson(people, new Person ("yadda"));

        for (Person person : people) {
            System.out.println(person.firstName);
        }



    }

//    public static Person[] addPerson(Person[] people,Person person){
//        return Arrays.copyOf(people, people.length + 1);
//    }


    public static Person[] addPerson(Person[] people, Person person){
        Person[] newArray = Arrays.copyOf(people, people.length + 1);
        newArray[people.length] = person;
        return newArray;
    }
}
