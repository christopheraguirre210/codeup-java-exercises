public class Instructor extends Employee{

    public Instructor(String instructorsName){
        super(instructorsName);
    }

    @Override
    public void doWork() {
        System.out.println("Coding...");
        System.out.println("Teaching...");
        System.out.println("Explaining...");
    }

}
