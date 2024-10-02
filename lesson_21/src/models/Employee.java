package models;

abstract public class Employee {
    private String name;
    private String surname;
    private int age;
    private String post;
    private int salary;

    private WorkSchedule schedule;

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getPost() {
        return post;
    }

    public int getSalary() {
        return salary;
    }

    public Employee(){}

    public Employee(String name, String surname, int age, String post, int salary){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.post = post;
        this.salary = salary;
    }
    abstract public void performanceOfDuties();

}
