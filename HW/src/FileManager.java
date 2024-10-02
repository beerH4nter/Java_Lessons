import java.io.*;
import java.util.*;
import java.util.regex.*;

public class FileManager {

    private static final String FILE_PATH = "textFile.txt";

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nМеню:");
            System.out.println("1 - Добавить (слово, строку)");
            System.out.println("2 - Заменить (слово на новое слово)");
            System.out.println("3 - Удалить (все слова которые равны тому что ввел пользователь)");
            System.out.println("4 - Считать количество символов");
            System.out.println("5 - Считать количество слов (общее)");
            System.out.println("6 - Считать количество предложений");
            System.out.println("7 - Считать количество слова (которое ввел пользователь)");
            System.out.println("8 - Просмотр");
            System.out.println("9 - Выход");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addText(scanner);
                    break;
                case 2:
                    replaceText(scanner);
                    break;
                case 3:
                    deleteWord(scanner);
                    break;
                case 4:
                    countCharacters();
                    break;
                case 5:
                    countWords();
                    break;
                case 6:
                    countSentences();
                    break;
                case 7:
                    countSpecificWord(scanner);
                    break;
                case 8:
                    viewFile();
                    break;
                case 9:
                    System.out.println("Выход...");
                    break;
                default:
                    System.out.println("Неверный выбор. Пожалуйста, выберите снова.");
            }
        } while (choice != 9);

        scanner.close();
    }

    private static void addText(Scanner scanner) throws IOException {
        System.out.println("Введите текст для добавления:");
        String text = scanner.nextLine();
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH, true))) {
            writer.write(text);
            writer.newLine();
        }
    }

    private static void replaceText(Scanner scanner) throws IOException {
        System.out.println("Введите слово для замены:");
        String oldWord = scanner.nextLine();
        System.out.println("Введите новое слово:");
        String newWord = scanner.nextLine();
        String content = readFile();
        content = content.replaceAll("\\b" + Pattern.quote(oldWord) + "\\b", newWord);
        writeFile(content);
    }

    private static void deleteWord(Scanner scanner) throws IOException {
        System.out.println("Введите слово для удаления:");
        String wordToDelete = scanner.nextLine();
        String content = readFile();
        content = content.replaceAll("\\b" + Pattern.quote(wordToDelete) + "\\b", "");
        writeFile(content);
    }

    private static void countCharacters() throws IOException {
        String content = readFile();
        System.out.println("Количество символов: " + content.length());
    }

    private static void countWords() throws IOException {
        String content = readFile();
        String[] words = content.split("[\\s,!?\\.]+");
        System.out.println("Общее количество слов: " + words.length);
    }

    private static void countSentences() throws IOException {
        String content = readFile();
        String[] sentences = content.split("[.!?]");
        System.out.println("Количество предложений: " + sentences.length);
    }

    private static void countSpecificWord(Scanner scanner) throws IOException {
        System.out.println("Введите слово для подсчета:");
        String wordToCount = scanner.nextLine();
        String content = readFile();
        String[] words = content.split("[\\s,!?\\.]+");
        int count = 0;
        for (String word : words) {
            if (word.equals(wordToCount)) {
                count++;
            }
        }
        System.out.println("Количество слова \"" + wordToCount + "\": " + count);
    }

    private static void viewFile() throws IOException {
        String content = readFile();
        System.out.println("Содержимое файла:");
        System.out.println(content);
    }

    private static String readFile() throws IOException {
        StringBuilder contentBuilder = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH))) {
            String line;
            while ((line = reader.readLine()) != null) {
                contentBuilder.append(line).append(System.lineSeparator());
            }
        }
        return contentBuilder.toString();
    }

    private static void writeFile(String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            writer.write(content);
        }
    }
}
