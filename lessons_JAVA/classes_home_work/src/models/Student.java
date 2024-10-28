package models;

public class Student extends Person{
    private String grade;
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    public void study(){
        System.out.println("The student is studying");
    }
}
