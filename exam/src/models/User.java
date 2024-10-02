package models;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class User {
    private String login;
    private String password;
    private LocalTime creationUser;
    private List<Person> contacts;



    public User(String login, String password) throws IOException {
        String creationTime = LocalTime.now().toString();
        this.login = login;
        this.password = password;
        this.creationUser = LocalTime.parse(creationTime);
        this.contacts = new ArrayList<>();
    }

    public boolean userContactsIsEmpty(){
        return this.contacts.isEmpty();
    }

    public LocalTime getCreationUser() {
        return creationUser;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Person> getContacts() {
        return contacts;
    }

    public void setContacts(List<Person> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", login, password, creationUser);
    }
}
