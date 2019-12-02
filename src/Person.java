public class Person {

    public static void main(String[] args) {


        Person chris = new Person("Chris");
        System.out.println(chris.getFirstName());
//        System.out.println(chris.setFirstName("Aggie"));
        System.out.println(chris.sayHello());


    }

        public String firstName;
        private String lastName;
//        public static long worldPopulation = 7_500_000_000L;
//        private String ssn;


//        Executes every time that someone makes a new Object()

//        public Person(){
//            this.worldPopulation++;
//        }

//

//      Constructor with specific rules

        public Person(String firstNameExternal){
            this.firstName = firstNameExternal;
//            this.lastName = lastNameEternal;

        }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String sayHello() {
        return String.format("%s says Hello!", firstName);
    }

}
