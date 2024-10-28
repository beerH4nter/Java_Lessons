package navigation;

import utils.FileManager;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookMenu {
    private static final int WIDTH = 80;
    private static MethodsForMenu frameBuilder;
    private static Scanner scanner;

    public static void phoneBook() {
        frameBuilder = new MethodsForMenu(WIDTH);
        scanner = new Scanner(System.in);

        Map<Integer, Runnable> menuActions = new HashMap<>();
        menuActions.put(0, PhoneBookMenu::saveAndExit);
        menuActions.put(1, PhoneBookMenu::contacts);
        menuActions.put(2, PhoneBookMenu::print);
        menuActions.put(3, PhoneBookMenu::sorting);
        menuActions.put(4, PhoneBookMenu::search);
        menuActions.put(5, PhoneBookMenu::comeBack);

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
        frameBuilder.addSubtitle("главное меню");
        frameBuilder.addSeparator();
        frameBuilder.addOption("0", "сохранить и выйти ( сохранить и выйти из программы )");
        frameBuilder.addSeparator();
        frameBuilder.addOption("1", "контакты      ( добавить / редактировать / удалить )");
        frameBuilder.addSeparator();
        frameBuilder.addOption("2", "печать         ( все )");
        frameBuilder.addSeparator();
        frameBuilder.addOption("3", "сортировка     ( имя / фамилия / номер )");
        frameBuilder.addSeparator();
        frameBuilder.addOption("4", "поиск          ( по имени / фамилии / номеру )");
        frameBuilder.addSeparator();
        frameBuilder.addOption("5", "назад          ( сохранить и выйти из телефонной книги )");
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

    private static void saveAndExit() {
        System.out.println("сохранение и выход из программы...");
        System.exit(0);
    }

    private static void contacts() {
        System.out.println("открытие меню контактов...");
        ContactMenu.contact();
    }

    private static void print() {
        System.out.println("открытие меню печати...");
        PrintMenu.print();
    }

    private static void sorting() {
        System.out.println("открытие меню сортировки...");
        SortingMenu.sorting();
    }

    private static void search() {
        System.out.println("открытие меню поиска...");
        SearchMenu.search();
    }

    private static void comeBack() {
        System.out.println("возвращение в начало...");
        FileManager.saveAllContacts();
        ChooseAction.action();
    }
}