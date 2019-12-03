public class Person {

    public static void main(String[] args) {


        Person christof = new Person("Chris");
        System.out.println(christof.getName());
        christof.sayHello();

    }

        private String name;
        private String lastName;
//        public static long worldPopulation = 7_500_000_000L;
//        private String ssn;


//        Executes every time that someone makes a new Object()

//        public Person(){
//            this.worldPopulation++;
//        }

//

//      Constructor with specific rules

        public Person(String nameExternal){
            this.name = nameExternal;

        }

    public String getName() {
        return this.name;
    }
//    public String getLastName() {
//        return this.lastName;
//    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println(this.name + " says Hello!");
    }



}
