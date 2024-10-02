package models;

import Interfaces.Area;

public class Square implements Area {

    int height;
    int width;
    public Square(int height, int width){
        this.height = height;
        this.width = width;
    }
    @Override
    public double calculateArea(){
        return height * width;
    }
}
