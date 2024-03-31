import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number: ");
//        int num = scanner.nextInt();
//        for (int i = 1; i < 10; i++)
//        {
//            System.out.println(num + " * " + i + " = " + (num * i));
//        }

        int count = 0;
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 0; j < 5 - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < i + count; j++)
            {
                System.out.print(i);
            }
            count ++;
            System.out.println();
        }



    }
}