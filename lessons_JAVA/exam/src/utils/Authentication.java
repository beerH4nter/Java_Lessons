package utils;

import enums.Paths;
import models.Person;
import models.Session;
import models.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Authentication {

    public static boolean usersExists(String login) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(Paths.ALL_USERS.getPath()));
        String line;
        boolean userExist = false;
        while ((line = reader.readLine()) != null) {
            if(Objects.equals(line.split(" ")[0], login)){
                userExist = true;
                break;
            }
        }
        if(userExist){
            return true;
        } else {
            return false;
        }
    }
    public static void registration(String login, String password) throws IOException {
        User user = new User(login, password);
        FileManager.createUserFolder(login);
        FileManager.addUser(user);
        Session currentSession = new Session(user);
    }

    public static void authorisation(String login, String password) throws IOException {
            BufferedReader reader = new BufferedReader(new FileReader(Paths.ALL_USERS.getPath()));
            String line;
            boolean userExist = false;
            User user;
            Session currentSession;
            while ((line = reader.readLine()) != null) {
                if(Objects.equals(line.split(" ")[0], login) && Objects.equals(line.split(" ")[1], password)){
                    userExist = true;
                }
            }
            if(userExist){
                user = new User(login, password);
                FileManager.readAllContacts(user);
                currentSession = new Session(user);
            }else {
                System.out.println("Пользователь не найден. Попробуйте зарегистрироваться.");

            }

    }


}
