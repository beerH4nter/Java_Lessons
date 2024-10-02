package models;

public class Person {

    private String name;
    private String gender;
    private int age;
    Person(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    Person(){
        name = "Jon";
        gender = "Male";
        age = 40;
    }

    public void displayInfo(){
        System.out.println("Name: " + name + "\nGender: " + gender + "\nAge: " + age);
    }
}




