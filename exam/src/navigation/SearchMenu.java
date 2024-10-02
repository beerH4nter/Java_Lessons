package navigation;

import utils.Searching;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SearchMenu {
    private static final int WIDTH = 50;
    private static MethodsForMenu frameBuilder;
    private static Scanner scanner;

    public static void search() {
        frameBuilder = new MethodsForMenu(WIDTH);
        scanner = new Scanner(System.in);

        Map<Integer, Runnable> menuActions = new HashMap<>();
        menuActions.put(-1, SearchMenu::returnToMainMenu);
        menuActions.put(0, SearchMenu::searchByName);
        menuActions.put(1, SearchMenu::searchBySurname);
        menuActions.put(2, SearchMenu::searchByNumber);

        while (true) {
            displayMenu();
            int choice = getUserChoice();

            Runnable action = menuActions.get(choice);
            if (action != null) {
                action.run();
            } else {
                System.out.println("неверный выбор, пожалуйста, попробуйте снова.");
            }
        }
    }

    private static void displayMenu() {
        frameBuilder.clear();
        frameBuilder.addTitle("<< телефонная книга >>");
        frameBuilder.addSubtitle("главное меню -> поиск");
        frameBuilder.addSeparator();
        frameBuilder.addOption("-1", "назад  ( вернуться в главное меню )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 0", "имя        ( поиск по имени  )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 1", "фамилия    ( поиск по фамилии )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 2", "номер      ( поиск по номеру )");
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

    private static void searchByName() {
        System.out.println("Введите имя: ");
        String name = scanner.next();
        if(Searching.searchByName(name) != null){
            System.out.println("поиск по имени...");
            Searching.searchByName(name).forEach(c-> System.out.println(c.toString()));
        }else {
            System.out.println("Ничего не найдено.");
        }
        SearchMenu.search();
    }

    private static void searchBySurname() {
        System.out.println("Введите фамилию: ");
        String surname = scanner.next();
        if(Searching.searchBySurname(surname) != null){
            System.out.println("поиск по фамилии...");
            Searching.searchBySurname(surname).forEach(c-> System.out.println(c.toString()));
        }else {
            System.out.println("Ничего не найдено.");
        }
        SearchMenu.search();
    }

    private static void searchByNumber() {
        System.out.println("Введите номер: ");
        String phone = scanner.next();
        if(Searching.searchByPhone(phone) != null){
            System.out.println("поиск по номеру...");
            Searching.searchByPhone(phone).forEach(c-> System.out.println(c.toString()));
        }else {
            System.out.println("Ничего не найдено.");
        }
        SearchMenu.search();
    }
}