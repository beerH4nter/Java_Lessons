package models;

import Interfaces.Printable;

public class Document implements Printable {
    @Override
    public void print(){
        System.out.println("This is a document!");
    }
}
