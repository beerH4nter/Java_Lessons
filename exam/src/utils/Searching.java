package utils;

import models.Person;
import models.Session;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Searching {
    public static List<Person> searchByName(String name){
        List<Person>reachedContacts = new ArrayList<>();
        reachedContacts = Session.getCurrentUserContacts().stream().filter(x->x.getName().startsWith(name)).collect(Collectors.toList());
        if(reachedContacts.isEmpty()){
            return null;
        }else {
            return reachedContacts;
        }
    }

    public static List<Person> searchBySurname(String surname){
        List<Person>reachedContacts = new ArrayList<>();
        reachedContacts = Session.getCurrentUserContacts().stream().filter(x->x.getSurname().startsWith(surname)).collect(Collectors.toList());
        if(reachedContacts.isEmpty()){
            return null;
        }else {
            return reachedContacts;
        }
    }

    public static List<Person> searchByPhone(String phone){
        List<Person>reachedContacts = new ArrayList<>();
        reachedContacts = Session.getCurrentUserContacts().stream().filter(x->x.getPhone().startsWith(phone)).collect(Collectors.toList());
        if(reachedContacts.isEmpty()){
            return null;
        }else {
            return reachedContacts;
        }
    }

}
