//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{

    public static void main(String[] args)
    {

        int a = 20;
        int b = 2;
        int c = 15;

        if(a > b && b > c)
        {
            System.out.println("Max: " + a);
            System.out.println("Min: " + c);
        }
        else if (a > c && c > b)
        {
            System.out.println("Max: " + a);
            System.out.println("Min: " + b);
        }
        else if (b > a && a > c)
        {
            System.out.println("Max: " + b);
            System.out.println("Min: " + c);
        }
        else if (b > c && c > a)
        {
            System.out.println("Max: " + b);
            System.out.println("Min: " + a);
        }
        else if (c > b && b > a)
        {
            System.out.println("Max: " + c);
            System.out.println("Min: " + a);
        }
        else
        {
            System.out.println("Max: " + c);
            System.out.println("Min: " + b);
        }

        a = -27;

        if (a > 0 && a != 0)
        {
            System.out.println(a + " is positive");

            if(a % 2 == 0 && a % 5 == 0)
            {
                System.out.println(a + " is odd and multiple of five");
            }
            else if (a % 2 == 0 && a % 5 != 0)
            {
                System.out.println(a + " is odd and not multiple of five");
            }
            else if (a % 2 != 0 && a % 5 == 0)
            {
                System.out.println(a + " is even and multiple of five");
            }
            else
            {
                System.out.println(a + " is even and not multiple of five");
            }
        }
        else if(a < 0 && a != 0)
        {
            System.out.println(a + " is negative");

            if(a % 2 == 0 && a % 5 == 0)
            {
                System.out.println(a + " is odd and multiple of five");
            }
            else if (a % 2 == 0 && a % 5 != 0)
            {
                System.out.println(a + " is odd and not multiple of five");
            }
            else if (a % 2 != 0 && a % 5 == 0)
            {
                System.out.println(a + " is even and multiple of five");
            }
            else
            {
                System.out.println(a + " is even and not multiple of five");
            }
        }
        else
        {
            System.out.println(a + " is equal zero");
        }
    }

}