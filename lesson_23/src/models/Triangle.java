package models;

import Interfaces.Area;

public class Triangle implements Area {
    int height;
    int width;

    public Triangle(int height, int width){
        this.height = height;
        this.width = width;
    }
    @Override
    public double calculateArea(){
        return height * (width/2);
    }
}
