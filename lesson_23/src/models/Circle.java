package models;

import Interfaces.Area;
import Interfaces.Drawable;

public class Circle implements Drawable, Area {

    double radius;
    double pi;
    public Circle(int radius, double pi){
        this.radius = radius;
        this.pi = pi;
    }
    @Override
    public void draw(){
        System.out.println("Drawing an circle!");
    }

    @Override
    public double calculateArea(){
        return pi * radius * radius;
    }
}
