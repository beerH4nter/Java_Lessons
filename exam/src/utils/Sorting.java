package utils;

import models.Person;
import models.Session;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorting {
    public static void forwardNameSorting(){
        Session.setCurrentUserContacts(Session.getCurrentUserContacts().stream().sorted((x,y)->x.getName().compareTo(y.getName())).collect(Collectors.toList()));
    }

    public static void backwardNameSorting(){
        Session.setCurrentUserContacts(Session.getCurrentUserContacts().stream().sorted((x,y)->y.getName().compareTo(x.getName())).collect(Collectors.toList()));
    }

    public static void forwardSurnameSorting(){
        Session.setCurrentUserContacts(Session.getCurrentUserContacts().stream().sorted((x,y)->x.getSurname().compareTo(y.getSurname())).collect(Collectors.toList()));
    }

    public static void backwardSurnameSorting(){
        Session.setCurrentUserContacts(Session.getCurrentUserContacts().stream().sorted((x,y)->y.getSurname().compareTo(x.getSurname())).collect(Collectors.toList()));
    }

    public static void forwardAgeSorting(){
        Session.setCurrentUserContacts(Session.getCurrentUserContacts().stream().sorted(Comparator.comparingInt(Person::getAge)).collect(Collectors.toList()));
    }

    public static void backwardAgeSorting(){
        Session.setCurrentUserContacts(Session.getCurrentUserContacts().stream().sorted(Comparator.comparingInt(Person::getAge).reversed()).collect(Collectors.toList()));
    }

}
