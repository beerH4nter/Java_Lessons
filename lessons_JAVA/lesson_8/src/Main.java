import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {


        for (int i = 0; i <= 8; i++)
        {
            for (int j = 0; j < 8 - i; j++)
            {
                System.out.print(" ");
            }

            System.out.print("*");
            for (int j = 0; j < i*2; j++)
            {
                System.out.print(" ");
            }
            System.out.print(" *");
            System.out.println();
            if(i == 8)
            {
                for (int j = 0; j < 10; j++)
                {
                    System.out.print("* ");
                }
            }
        }

        System.out.println("\n");


        System.out.println("* *");
        for (int i = 1; i <= 7; i++)
        {
            System.out.print("*");
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            System.out.print(" *");
            System.out.println();
            if (i == 7)
                for (int j = 0; j < 6; j++)
                {
                    System.out.print("* ");
                }
        }

        System.out.println();

        for (int i = 1; i <= 7; i++)
        {
            if (i == 1) {
                for (int j = 0; j < 6; j++) {
                    System.out.print("* ");

                }
                System.out.println();
            }
            System.out.print("*");
            for (int j = 0; j < 8 - i; j++)
            {
                System.out.print(" ");
            }
            System.out.print(" *");
            System.out.println();

        }
        System.out.println("* *");

        System.out.println();

        int firstCount = 1;
        int secCount = 25;
        for (int i = 0; i < 26; i++)
        {
            if (i <= 12)
            {
                for (int j = 0; j < 32 - i; j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < i + firstCount; j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            else
            {
                for (int j = 0; j < firstCount * 2 - i + 5; j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                for (int j = 0; j < secCount; j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
                secCount-=2;
            }
            firstCount++;

            System.out.println();

        }

        System.out.println();

        for (int i = 0; i < 8; i++)
        {
            if (i == 0 || i == 7) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("* ");
                }
            }
            else
            {
                System.out.print("*");
                for (int j = 0; j < 7; j++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }





        }
}