package utils;

import models.Session;

public class Printing {
    public static void printAllContacts(){
        Session.getCurrentUserContacts().forEach(p-> System.out.println(p));
    }

}
