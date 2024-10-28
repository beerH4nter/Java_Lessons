package models;

public class Car extends Vehicle{
    private int year;

    public Car(String make, String model, int year) {
        super(make, model);
        this.year = year;
    }

    @Override
    public void displayInfo(){
        System.out.println("The year of manufacture: " + this.year + "\nMake: " + getMake() + "\nModel: " + getModel());
    }
}
