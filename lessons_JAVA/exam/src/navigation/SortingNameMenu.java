package navigation;

import utils.Sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortingNameMenu {
    private static final int WIDTH = 50;
    private static MethodsForMenu frameBuilder;
    private static Scanner scanner;

    public static void sortingName() {
        frameBuilder = new MethodsForMenu(WIDTH);
        scanner = new Scanner(System.in);

        Map<Integer, Runnable> menuActions = new HashMap<>();
        menuActions.put(-1, SortingNameMenu::comeBack);
        menuActions.put(0, SortingNameMenu::sortNameAZ);
        menuActions.put(1, SortingNameMenu::sortNameZA);

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
        frameBuilder.addSubtitle("главное меню -> сортировка -> имя");
        frameBuilder.addSeparator();
        frameBuilder.addOption("-1", "назад    ( вернуться к сортировке )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 0", "имя         ( сортировать A - Z )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 1", "имя         ( сортировать Z - A )");
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
        System.out.println("возвращение к меню сортировки...");
        SortingMenu.sorting();
    }

    private static void sortNameAZ() {
        System.out.println("сортировка имени от A до Z...");
        Sorting.forwardNameSorting();
        int width = 50;
        MethodsForMenu frameBuilder = new MethodsForMenu(width);
        frameBuilder.addTitle("<< телефонная книга >>");
        frameBuilder.addSubtitle("отсортировано от A до Z");
        frameBuilder.printFrame();
        sortingName();
    }

    private static void sortNameZA() {
        System.out.println("сортировка имени от Z до A...");
        Sorting.backwardNameSorting();
        int width = 50;
        MethodsForMenu frameBuilder = new MethodsForMenu(width);
        frameBuilder.addTitle("<< телефонная книга >>");
        frameBuilder.addSubtitle("отсортировано от Z до A");
        frameBuilder.printFrame();
        sortingName();
    }
}
