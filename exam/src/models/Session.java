package models;

import java.util.ArrayList;
import java.util.List;

public class Session {

    private static String currentUserLogin;

    private static List<Person> currentUserContacts;

    public static void setCurrentUserContacts(List<Person> currentUserContacts) {
        Session.currentUserContacts = currentUserContacts;
    }

    public Session(User user) {
        Session.currentUserLogin = user.getLogin();
        Session.currentUserContacts = user.getContacts();
    }

    public static String getCurrentUserLogin() {
        return currentUserLogin;
    }

    public static List<Person> getCurrentUserContacts() {
        return currentUserContacts;
    }
}
