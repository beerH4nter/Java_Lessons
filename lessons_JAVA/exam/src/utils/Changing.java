package utils;

import models.Person;
import models.Session;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Changing {

    static Scanner scanner = new Scanner(System.in);
    public static void addContact(){
        String name;
        String surname;
        String phone;
        int age = 0;
        boolean flag = false;
        System.out.println("Введите имя нового контакта: ");
        name = scanner.next();
        System.out.println("Введите фамилию нового контакта: ");
        surname = scanner.next();
        System.out.println("Введите телефон нового контакта: ");
        phone = scanner.next();
        do {
            System.out.println("Введите возраст нового контакта: ");
            scanner.nextLine();
            try{
                age = scanner.nextInt();
                flag = true;
            }catch (InputMismatchException exception){
                System.out.println("Неверный формат ввода!");
            }
        }while(!flag);
        Person newContact = new Person(surname, name, phone, age);
        Session.getCurrentUserContacts().add(newContact);

    }

    public static void changeContact(){
        String phone;
        AtomicBoolean flag = new AtomicBoolean(false);
        System.out.println("Введите номер телефона контакта, который вы хотите поменять: ");
        phone = scanner.next();
        Session.getCurrentUserContacts().forEach(u->{
            if(Objects.equals(u.getPhone(), phone)){
                System.out.println("Введите имя: ");
                u.setName(scanner.next());
                System.out.println("Введите фамилию: ");
                u.setSurname(scanner.next());
                System.out.println("Введите номер: ");
                u.setPhone(scanner.next());
                do{
                    System.out.println("Введите возраст: ");
                    scanner.nextLine();
                    try {
                        u.setName(scanner.next());
                        flag.set(true);
                    }catch (NumberFormatException exception){
                        System.out.println("Неверный формат ввода!");
                    }
                }while (!flag.get());

            }
        });
        if(!flag.get()){
            System.out.println("Контакт не найден.");
        }else {
            System.out.println("редактирование контакта...");
        }
    }

    public static void changeNameOfContact(){
        String phone;
        AtomicBoolean flag = new AtomicBoolean(false);
        System.out.println("Введите номер телефона контакта, который вы хотите поменять: ");
        phone = scanner.next();
        Session.getCurrentUserContacts().forEach(u->{
            if(Objects.equals(u.getPhone(), phone)){
                System.out.println("Введите имя: ");
                u.setName(scanner.next());
                flag.set(true);
            }
        });
        if(!flag.get()){
            System.out.println("Контакт не найден.");
        }else {
            System.out.println("редактирование контакта...");
        }
    }

    public static void changeSurnameOfContact(){
        String phone;
        AtomicBoolean flag = new AtomicBoolean(false);
        System.out.println("Введите номер телефона контакта, который вы хотите поменять: ");
        phone = scanner.next();
        Session.getCurrentUserContacts().forEach(u->{
            if(Objects.equals(u.getPhone(), phone)){
                System.out.println("Введите фамилию: ");
                u.setSurname(scanner.next());
                flag.set(true);
            }
        });
        if(!flag.get()){
            System.out.println("Контакт не найден.");
        }else {
            System.out.println("редактирование контакта...");
        }
    }

    public static void changePhoneOfContact(){
        String phone;
        AtomicBoolean flag = new AtomicBoolean(false);
        System.out.println("Введите номер телефона контакта, который вы хотите поменять: ");
        phone = scanner.next();
        Session.getCurrentUserContacts().forEach(u->{
            if(Objects.equals(u.getPhone(), phone)){
                System.out.println("Введите номер: ");
                u.setPhone(scanner.next());
                flag.set(true);
            }
        });
        if(!flag.get()){
            System.out.println("Контакт не найден.");
        }else {
            System.out.println("редактирование контакта...");
        }
    }

    public static void changeAgeOfContact(){
        String phone;
        AtomicBoolean flag = new AtomicBoolean(false);
        System.out.println("Введите номер телефона контакта, который вы хотите поменять: ");
        phone = scanner.next();
        Session.getCurrentUserContacts().forEach(u->{
            if(Objects.equals(u.getPhone(), phone)){
                do {
                    System.out.println("Введите возраст: ");
                    scanner.nextLine();
                    try{
                        u.setAge(scanner.nextInt());
                        flag.set(true);
                    }catch (NumberFormatException exception){
                        System.out.println("Неверный формат ввода!");
                    }
                }while(!flag.get());
            }
        });
        if(!flag.get()){
            System.out.println("Контакт не найден.");
        }else {
            System.out.println("редактирование контакта...");
        }
    }

    public static void deleteContact(){
        String phone;
        boolean flag = false;
        System.out.println("Введите номер телефона контакта, который вы хотите поменять: ");
        phone = scanner.next();

        if(Session.getCurrentUserContacts().removeIf(c->c.getPhone().equals(phone))){
            flag = true;
        }

        if(!flag){
            System.out.println("Контакт не найден.");
        }else {
            System.out.println("удаление контакта...");
        }
    }

}
