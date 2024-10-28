package models;

public class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public void work(){
        System.out.println("The worker is working...");
    }
}
