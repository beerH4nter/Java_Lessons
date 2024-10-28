package navigation;

import models.Person;
import utils.Authentication;
import utils.FileManager;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class ChooseAction {
    private static final int WIDTH = 80;
    private static MethodsForMenu frameBuilder;
    private static Scanner scanner;

    public static void action() {
        frameBuilder = new MethodsForMenu(WIDTH);
        scanner = new Scanner(System.in);

        Map<Integer, Runnable> menuActions = new HashMap<>();
        menuActions.put(0, ChooseAction::exitProgram);
        menuActions.put(1, ChooseAction::signIn);
        menuActions.put(2, ChooseAction::signUp);
        menuActions.put(3, ChooseAction::printUsers);

        while (true) {
            displayMenu();
            int choice = getUserChoice();

            Runnable action = menuActions.get(choice);
            if (action != null) {
                action.run();
                break;
            } else {
                System.out.println("неверный выбор, пожалуйста, попробуйте снова.");
            }
        }
    }

    private static void displayMenu() {
        frameBuilder.clear();
        frameBuilder.addTitle("<< телефонная книга >>");
        frameBuilder.addSubtitle("выберите действие:");
        frameBuilder.addSeparator();
        frameBuilder.addOption("0", "выход           ( выйти из программы )");
        frameBuilder.addSeparator();
        frameBuilder.addOption("1", "войти           ( перейти к существующему пользователю )");
        frameBuilder.addSeparator();
        frameBuilder.addOption("2", "зарегистрироваться ( зарегистрировать нового пользователя )");
        frameBuilder.addSeparator();
        frameBuilder.addOption("3", "показать пользователей ( вывести существующих пользователей )");
        frameBuilder.printFrame();
    }

    private static int getUserChoice() {
        System.out.print("пожалуйста, введите ваш выбор: ");
        while (!scanner.hasNextInt()) {
            System.out.print("неверный ввод. Пожалуйста, введите число: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void exitProgram() {
        System.out.println("выход из программы...");
        System.exit(0);
    }

    private static void signIn(){
        boolean flag = false;
        String login;
        String password;
        String secPassword;
        System.out.println("Пожалуйста введите логин: ");
        login = scanner.next();
        System.out.println("Пожалуйста введите пароль: ");
        password = scanner.next();
        try{
            Authentication.authorisation(login, password);
        }catch (IOException exception){
            System.out.println("Пользователь не найден.");
            action();
        }
        System.out.println("вход в систему...");
        PhoneBookMenu.phoneBook();
    }

    private static void signUp(){
        boolean flag = false;
        String login;
        String password;
        String secPassword;
        System.out.println("Пожалуйста введите логин: ");
        login = scanner.next();
        try{
            if(Authentication.usersExists(login)){
                System.out.println("Пользователь с таким логином уже существует, пожалуйста придумайте другой.");
                action();
            }
        }catch (IOException exception){
            System.out.println("Ошибка файла.");
            action();
        }

        do{
            System.out.println("Пожалуйста введите пароль: ");
            password = scanner.next();
            System.out.println("Пожалуйста повторите пароль: ");
            secPassword = scanner.next();
            if(Objects.equals(password, secPassword)){
                try {
                    Authentication.registration(login, password);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                flag = true;
            }else {
                System.out.println("Пароли не совпадают.");
            }
        }while (!flag);

        System.out.println("регистрация нового пользователя...");
        PhoneBookMenu.phoneBook();
    }

    private static void printUsers() {
        System.out.println("печать списка пользователей...");

        try {
            FileManager.readAllUsers().forEach(System.out::println);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        action();

    }
}