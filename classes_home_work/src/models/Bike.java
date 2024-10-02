package models;

public class Bike extends Vehicle{
    private int frameSize;

    public Bike(String make, String model, int frameSize) {
        super(make, model);
        this.frameSize = frameSize;
    }

    @Override
    public void displayInfo(){
        System.out.println("Frame size: " + this.frameSize + "\nMake: " + getMake() + "\nModel: " + getModel());
    }
}
