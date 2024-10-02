package navigation;

import utils.Sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortingNumberMenu {
    private static final int WIDTH = 50;
    private static MethodsForMenu frameBuilder;
    private static Scanner scanner;

    public static void sortingNumber() {
        frameBuilder = new MethodsForMenu(WIDTH);
        scanner = new Scanner(System.in);

        Map<Integer, Runnable> menuActions = new HashMap<>();
        menuActions.put(-1, SortingNumberMenu::comeBack);
        menuActions.put(0, SortingNumberMenu::sortNumberAsc);
        menuActions.put(1, SortingNumberMenu::sortNumberDesc);

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
        frameBuilder.addSubtitle("главное меню -> сортировка -> номер");
        frameBuilder.addSeparator();
        frameBuilder.addOption("-1", "назад    ( вернуться к сортировке )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 0", "номер       ( сортировать 1 - 9 )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 1", "номер       ( сортировать 9 - 1 )");
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

    private static void sortNumberAsc() {
        System.out.println("сортировка возраста от 1 до 9...");
        Sorting.forwardAgeSorting();
        int width = 50;
        MethodsForMenu frameBuilder = new MethodsForMenu(width);
        frameBuilder.addTitle("<< телефонная книга >>");
        frameBuilder.addSubtitle("отсортировано от 1 до 9");
        frameBuilder.printFrame();
        sortingNumber();
    }

    private static void sortNumberDesc() {
        System.out.println("сортировка номеров от 9 до 1...");
        Sorting.backwardAgeSorting();
        int width = 50;
        MethodsForMenu frameBuilder = new MethodsForMenu(width);
        frameBuilder.addTitle("<< телефонная книга >>");
        frameBuilder.addSubtitle("отсортировано от 9 до 1");
        frameBuilder.printFrame();
        sortingNumber();
    }
}