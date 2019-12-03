public class Employee extends Person {

        public Employee(String employeeName){
            super(employeeName);
        }

        public void doWork(){
            System.out.println("Working...");
        }

        @Override
        public String sayHello(){
            return ("How can I help you");
        }


}
