package models;

public class Cashier extends Employee{

    public Cashier(String name, String surname, int age, String post, int salary){
        super(name, surname, age, post, salary);
    }
    @Override
    public void performanceOfDuties(){
        System.out.println("Peep, peep, peep, peep, GALYA OTMENA!!!");
    }



}
