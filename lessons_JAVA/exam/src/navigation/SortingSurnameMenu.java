package navigation;

import utils.Sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortingSurnameMenu {
    private static final int WIDTH = 50;
    private static MethodsForMenu frameBuilder;
    private static Scanner scanner;

    public static void sortingSurname() {
        frameBuilder = new MethodsForMenu(WIDTH);
        scanner = new Scanner(System.in);

        Map<Integer, Runnable> menuActions = new HashMap<>();
        menuActions.put(-1, SortingSurnameMenu::comeBack);
        menuActions.put(0, SortingSurnameMenu::sortSurnameAZ);
        menuActions.put(1, SortingSurnameMenu::sortSurnameZA);

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
        frameBuilder.addSubtitle("главное меню -> сортировка -> фамилия");
        frameBuilder.addSeparator();
        frameBuilder.addOption("-1", "назад    ( вернуться к сортировке )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 0", "фамилия     ( сортировать A - Z )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 1", "фамилия     ( сортировать Z - A )");
        frameBuilder.printFrame();
    }

    private static int getUserChoice() {
        System.out.print("пожалуйста, введите ваш выбор: ");
        while (!scanner.hasNextInt()) {
            System.out.print("неверный ввод. пожалуйста, введите число: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    private static void comeBack() {
        System.out.println("возвращение к сортировке...");
        SortingMenu.sorting();
    }

    private static void sortSurnameAZ() {
        System.out.println("сортировка фамилии от A до Z...");
        Sorting.forwardSurnameSorting();
        int width = 50;
        MethodsForMenu frameBuilder = new MethodsForMenu(width);
        frameBuilder.addTitle("<< телефонная книга >>");
        frameBuilder.addSubtitle("отсортировано от A до Z");
        frameBuilder.printFrame();
        sortingSurname();
    }

    private static void sortSurnameZA() {
        System.out.println("сортировка фамилии от Z до A...");
        Sorting.backwardSurnameSorting();
        int width = 50;
        MethodsForMenu frameBuilder = new MethodsForMenu(width);
        frameBuilder.addTitle("<< телефонная книга >>");
        frameBuilder.addSubtitle("отсортировано от Z до A");
        frameBuilder.printFrame();
        sortingSurname();
    }
}