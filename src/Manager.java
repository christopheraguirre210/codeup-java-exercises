public class Manager extends Employee {
    public Manager(String managerName){
        super(managerName);
    }

    @Override
    public void doWork(){
        System.out.println("Managing employees");
    }
}
