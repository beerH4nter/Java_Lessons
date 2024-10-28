package navigation;

import utils.Printing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintMenu {
    private static final int WIDTH = 70;
    private static MethodsForMenu frameBuilder;
    private static Scanner scanner;

    public static void print() {
        frameBuilder = new MethodsForMenu(WIDTH);
        scanner = new Scanner(System.in);

        Map<Integer, Runnable> menuActions = new HashMap<>();
        menuActions.put(-1, PrintMenu::comeBack);
        menuActions.put(0, PrintMenu::printAll);

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
        frameBuilder.addSubtitle("главное меню -> меню печати");
        frameBuilder.addSeparator();
        frameBuilder.addOption("-1", "назад    ( вернуться в главное меню )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 0", "печать    ( все )");
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

    private static void printAll() {
        System.out.println("печать всех контактов...");
        Printing.printAllContacts();
        print();
    }

}