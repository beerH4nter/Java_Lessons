import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num = scanner.nextInt();
        int value = 1;
        int count = 1;

        do
        {
            value = num * count;

            //System.out.printf("%d x %d = %d", count, num, value);
            System.out.println(count + " x " + num + " = " + value);
            count ++;

        }while (count <= 100);


//        while(count <= 100)
//        {
//            value = num * count;
//            System.out.printf("%d x %d = %d", count, num, value);
//            count ++;
//            System.out.println();
//        }
    }
}