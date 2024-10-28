package navigation;

import utils.Changing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactMenu {
    private static final int WIDTH = 50;
    private static MethodsForMenu frameBuilder;
    private static Scanner scanner;

    public static void contact() {
        frameBuilder = new MethodsForMenu(WIDTH);
        scanner = new Scanner(System.in);

        Map<Integer, Runnable> menuActions = new HashMap<>();
        menuActions.put(-1, ContactMenu::returnToMainMenu);
        menuActions.put(0, ContactMenu::addContact);
        menuActions.put(1, ContactMenu::editContact);
        menuActions.put(2, ContactMenu::deleteContact);

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
        frameBuilder.addSubtitle("главное меню -> меню контактов");
        frameBuilder.addSeparator();
        frameBuilder.addOption("-1", "назад    ( вернуться в главное меню )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 0", "добавить  ( добавить новый контакт )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 1", "редактировать  ( редактировать контакт )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 2", "удалить   ( удалить контакт )");
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

    private static void returnToMainMenu() {
        System.out.println("возвращение в главное меню...");
        PhoneBookMenu.phoneBook();
    }

    private static void addContact() {
        Changing.addContact();
        System.out.println("добавление нового контакта...");
        contact();
    }

    private static void editContact() {
        EditMenu.edit();
    }

    private static void deleteContact() {
        Changing.deleteContact();
        contact();
    }
}