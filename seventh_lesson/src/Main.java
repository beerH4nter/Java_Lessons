//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        int count = 1;
        for (int i = 1; i <= 8; i++)
        {
            for (int j = 0; j < 15 - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < count; j++)
            {
                System.out.print("*");
            }
            count += 2;
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <= 7; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < 7; i++)
        {
            for (int j = 0; j < 7 - i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < i; j++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        System.out.println();
        for (int i = 0; i < 8; i++)
        {
            for (int j = 0; j < 8 - i; j++)
            {
                System.out.print(" ");
            }
            System.out.println("*");
        }

        System.out.println();
        count = 1;
        for (int i = 1; i <= 8; i++)
        {
            for (int j = 0; j < 15 - i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < count; j++)
            {
                System.out.print("*");
            }
            count += 2;
            System.out.println();

        }
        for (int i = 1; i <= 9; i++)
        {
            for (int j = 0; j < i + 5; j++)
            {
                System.out.print(" ");
            }
            for (int j = 0; j < count; j++)
            {
                System.out.print("*");
            }
            count -= 2;
            System.out.println();

        }


    }
}