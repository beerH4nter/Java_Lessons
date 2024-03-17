//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{

    public static void main(String[] args)
    {

        System.out.println("Start\n");
        int a = 50;

        if(a > 0)
        {
            System.out.println("Positive");
        }
        if(a < 0)
        {
            System.out.println("Negative");
        }

        boolean isMan = true;
        int age = 18;
        if (isMan && age >= 18)
        {
            System.out.println("\nWelcom to army");
        }
        else
        {
            System.out.println("\nYou are lucky, but not for a long time");
        }

        System.out.println("\nFinish");
        
    }
}