import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;
import java.util.stream.Stream;




public class Main {

    static BufferedReader reader;

    static {
        try {
            reader = new BufferedReader(new FileReader("C:/Code/Lessons_Code/threads/test.txt"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static String line;
    static final String vowels = "aeiouy";
    static final String consonants = "bcdfghjklmnpqrstwvxz";

    static final String numbers = "0123456789";


    static {
        try {
            line = reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

     static public int vowelsOrConsonantsOrNumsInLine(String letters){
        int charCount = 0;
        for (int i = 0; i < line.length(); i++) {
            if(letters.contains(String.valueOf(line.charAt(i)))){
                charCount++;
            }
        }
        return charCount;
    }

    static public int valueOfWords(){

        long countOfSpaces = Stream.of(line.split("")).filter(x->x.equals(" ")).count();

        return (int)countOfSpaces + 1;
    }

    static public int valueOfRequiredChar(String letter){

        long countOfRequiredChars = Stream.of(line.split("")).filter(x->x.equals(letter.toLowerCase())).count();

        return (int)countOfRequiredChars;
    }

    static public int valueOfRequiredWord(String word){

        String newLine = line.replaceAll("[^A-Za-z ]+", "").toLowerCase();
        long countOfRequiredWords = Stream.of(newLine.split(" ")).filter(x->x.equals(word)).count();

        return (int)countOfRequiredWords;
    }


    public static void main(String[] args) throws InterruptedException, IOException {

        System.out.println("Text: \n" + line);

        ExecutorService executor = Executors.newFixedThreadPool(6);

        Runnable firstTask = ()->{
            System.out.println("Value of vowels in text: " + vowelsOrConsonantsOrNumsInLine(vowels));
        };

        Runnable secTask = ()->{
            System.out.println("Value of consonants in text: " + vowelsOrConsonantsOrNumsInLine(consonants));
        };

        Runnable thirdTask = ()->{
            System.out.println("Value of numbers in text: " + vowelsOrConsonantsOrNumsInLine(numbers));
        };

        Runnable fourthTask = ()->{
            System.out.println("Value of words in text: " + valueOfWords());
        };

        Runnable fifthTask = ()->{
            System.out.println("Value of required char in text: " + valueOfRequiredChar("a"));
        };

        Runnable sixthTask = ()->{
            System.out.println("Value of required word in text: " + valueOfRequiredWord("the"));
        };

        executor.execute(firstTask);
        executor.execute(secTask);
        executor.execute(thirdTask);
        executor.execute(fourthTask);
        executor.execute(fifthTask);
        executor.execute(sixthTask);

        executor.shutdown();

    }
}


//Создать программу которая будет считать из файла который содержит N-количество слов ( сказку)
//1) Количество классных символов
//2) Количество согласных символов
//3) Количество чисел символов
//4) Количество слов символов
//5) Количество указанного символа
//6) Количество указанного слово
//
//Выполнить данное задание используя потоки