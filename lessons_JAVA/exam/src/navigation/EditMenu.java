package navigation;

import utils.Changing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EditMenu {
    private static final int WIDTH = 70;
    private static MethodsForMenu frameBuilder;
    private static Scanner scanner;

    public static void edit() {
        frameBuilder = new MethodsForMenu(WIDTH);
        scanner = new Scanner(System.in);

        Map<Integer, Runnable> menuActions = new HashMap<>();
        menuActions.put(-1, EditMenu::returnToContactMenu);
        menuActions.put(0, EditMenu::editName);
        menuActions.put(1, EditMenu::editSurname);
        menuActions.put(2, EditMenu::editNumber);
        menuActions.put(3, EditMenu::editAge);
        menuActions.put(4, EditMenu::editAll);

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

    protected static void displayMenu() {
        frameBuilder.clear();
        frameBuilder.addTitle("<< телефонная книга >>");
        frameBuilder.addSubtitle("главное меню -> меню контактов -> редактировать");
        frameBuilder.addSubtitle("что вы хотите отредактировать?");
        frameBuilder.addSeparator();
        frameBuilder.addOption("-1", "назад    ( вернуться в меню контактов )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 0", "имя         ( редактировать имя контакта )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 1", "фамилию     ( редактировать фамилию контакта )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 2", "номер       ( редактировать номер контакта )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 3", "возраст         ( редактировать возраст контакта )");
        frameBuilder.addSeparator();
        frameBuilder.addOption(" 4", "все         ( редактировать имя/фамилию/номер/возраст )");
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

    private static void returnToContactMenu() {
        System.out.println("возвращение в меню контактов...");
        ContactMenu.contact();
    }

    private static void editName() {
        Changing.changeNameOfContact();
        edit();
    }

    private static void editSurname() {
        Changing.changeSurnameOfContact();
        edit();
    }

    private static void editNumber() {
        Changing.changePhoneOfContact();
        edit();
    }

    private static void editAge() {
        Changing.changeAgeOfContact();
        edit();
    }

    private static void editAll() {
        Changing.changeContact();
        edit();
    }
}