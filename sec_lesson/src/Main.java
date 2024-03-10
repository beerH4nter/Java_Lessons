
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        System.out.println("x = " + x + " y = " + y);

        int buff;
        buff = x;
        x = y;
        y = buff;
        System.out.println("After changes: x = " + x + " y = " + y);

        x = 7;
        y = 5;
        System.out.println("x = " + x + " y = " + y);
        x = y;
        y = 7;
        System.out.println("After changes: x = " + x + " y = " + y);

        x = 20;
        y = 30;
        System.out.println("x = " + x + " y = " + y);
        x = y + 5;
        y = x + 10;
        System.out.println("After changes: x = " + x + " y = " + y);






    }
}