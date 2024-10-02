package models;

import Interfaces.Area;
import Interfaces.Drawable;

public class Rectangle implements Drawable, Area {

    int height;
    int width;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
    }
    @Override
    public void draw(){
        System.out.println("Drawing an rectangle!");
    }
    @Override
    public double calculateArea(){
        return height * width;
    }

}
