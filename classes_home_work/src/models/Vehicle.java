package models;

abstract public class Vehicle {
    private String make;
    private String model;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public void displayInfo(){};
}
