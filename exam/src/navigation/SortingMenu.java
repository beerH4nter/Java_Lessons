package navigation;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SortingMenu {
    private static final int WIDTH = 50;
    private static MethodsForMenu frameBuilder;
    private static Scanner scanner;

    public static void sorting() {
        frameBuilder = new MethodsForMenu(WIDTH);
        scanner = new Scanner(System.in);

        Map<Integer, Runnable> menuActions = new HashMap<>();
        menuActions.put(-1, SortingMenu::comeBack);
        menuActions.put(0, SortingMenu::sortByName);
        menuActions.put(1, SortingMenu::sortBySurname);
        menuActions.put(2, SortingMenu::sortByAge);

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
        frameBuilder.addSubtitle("главное меню -> сортировка");
        frameBuilder.addSeparator();
        frameBuilder.addOption("-1", "назад    ( вернуться в главное меню )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 0", "имя         ( сортировать  A-Z / Z-A )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 1", "фамилия     ( сортировать  A-Z / Z-A )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 2", "возраст       ( сортировать  1-9 / 9-1 )");
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
        System.out.println("возвращение в главное меню...");
        PhoneBookMenu.phoneBook();
    }

    private static void sortByName() {
        System.out.println("переход к сортировке по имени...");
        SortingNameMenu.sortingName();
    }

    private static void sortBySurname() {
        System.out.println("переход к сортировке по фамилии...");
        SortingSurnameMenu.sortingSurname();
    }

    private static void sortByAge() {
        System.out.println("переход к сортировке по возрасту...");
        SortingNumberMenu.sortingNumber();
    }
}