package utils;

import enums.Paths;
import models.Person;
import models.Session;
import models.User;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.awt.SystemColor.text;

public class FileManager {


    public static void createUserFolder(String login) throws IOException {
        Path folderPath = java.nio.file.Paths.get(enums.Paths.USERS_FOLDERS.getPath() + "/" + login);
        Files.createDirectory(folderPath);
        File file = new File(Paths.USERS_FOLDERS.getPath() + "/" + login + "/" + "contacts.txt");
        file.createNewFile();
    }

    public static void addUser(User user){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(Paths.ALL_USERS.getPath(), true))) {
            writer.write(user.getLogin() + " " + user.getPassword() + " " + user.getCreationUser() + "\n");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи в файл: " + e.getMessage());
        }
    }

    public static void readAllContacts(User user){
        try (BufferedReader contactsReader = new BufferedReader(new FileReader(Paths.USERS_FOLDERS.getPath() + "/" + user.getLogin() + "/" + "contacts.txt"))) {
            String person;
            List<Person> contacts = new ArrayList<>();
            while ((person = contactsReader.readLine()) != null) {
                Person contact = new Person(person.split(" ")[0],person.split(" ")[1],person.split(" ")[2], Integer.parseInt(person.split(" ")[3]));
                contacts.add(contact);
            }
            user.setContacts(contacts);
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении файла: " + e.getMessage());
        }
    }

    public static List<String> readAllUsers() throws FileNotFoundException {
        List<String> users = new ArrayList<>();
        try(BufferedReader usersReader = new BufferedReader((new FileReader(Paths.FOLDER.getPath() + "/" + "allUsers.txt")))) {
            String user;
            while ((user = usersReader.readLine()) != null) {
                users.add(user.split(" ")[0]);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } ;
        return users;
    }

    public static void saveAllContacts(){

        File file = new File(Paths.USERS_FOLDERS.getPath() + "/" + Session.getCurrentUserLogin() + "/" + "contacts.txt");

        try {
            try (PrintWriter out = new PrintWriter(file.getAbsoluteFile())) {
                for (Person contact : Session.getCurrentUserContacts()) {
                    out.print(contact + "\n");
                }
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

    }







}
