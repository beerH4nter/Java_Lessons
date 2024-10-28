package models;

public class Manager extends Employee{
    private String department;
    public Manager(String name, int salary, String department) {
        super(name, salary);
        this.department = department;
    }
    public void work(){
        System.out.println("The manager is managing...");
    }

}
