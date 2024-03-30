import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter unit of measurement of yor number(sm, mm, m, t, kg, g):");
        String firstMeasure = scanner.next();
        System.out.println("Enter number you want to transfer:");
        double firstNum = scanner.nextInt();
        System.out.println("Enter unit of measurement to transfering number:");
        String secMeasure = scanner.next();

        double transferValue = 0;

        switch (firstMeasure)
        {
            case "t":
                switch (secMeasure)
                {
                    case "t":
                        transferValue = 1.0;
                        break;
                    case "kg":
                        transferValue = 1000.0;
                        break;
                    case "g":
                        transferValue = 1000000.0;
                        break;
                    default:
                        transferValue = 1.0;
                        System.out.println("Wrong unit of measurement!");
                        break;
                }
                break;
            case "kg":
                switch (secMeasure)
                {
                    case "t":
                        transferValue = 0.001;
                        break;
                    case "kg":
                        transferValue = 1.0;
                        break;
                    case "g":
                        transferValue = 1000.0;
                        break;
                    default:
                        transferValue = 1.0;
                        System.out.println("Wrong unit of measurement!");
                        break;
                }
                break;
            case "g":
                switch (secMeasure)
                {
                    case "t":
                        transferValue = 0.000001;
                        break;
                    case "kg":
                        transferValue = 0.001;
                        break;
                    case "g":
                        transferValue = 1.0;
                        break;
                    default:
                        transferValue = 1.0;
                        System.out.println("Wrong unit of measurement!");
                        break;
                }
                break;
            case "sm":
                switch (secMeasure)
                {
                    case "sm":
                        transferValue = 1.0;
                        break;
                    case "mm":
                        transferValue = 10.0;
                        break;
                    case "m":
                        transferValue = 0.01;
                        break;
                    default:
                        transferValue = 1.0;
                        System.out.println("Wrong unit of measurement!");
                        break;
                }
                break;
            case "mm":
                switch (secMeasure)
                {
                    case "sm":
                        transferValue = 0.1;
                        break;
                    case "mm":
                        transferValue = 1.0;
                        break;
                    case "m":
                        transferValue = 0.001;
                        break;
                    default:
                        transferValue = 1.0;
                        System.out.println("Wrong unit of measurement !");
                        break;
                }
                break;
            case "m":
                switch (secMeasure)
                {
                    case "sm":
                        transferValue = 100.0;
                        break;
                    case "mm":
                        transferValue = 1000.0;
                        break;
                    case "m":
                        transferValue = 1.0;
                        break;
                    default:
                        transferValue = 1.0;
                        System.out.println("Wrong unit of measurement !");
                        break;
                }
                break;
            default:
                transferValue = 1.0;
                System.out.println("Wrong unit of measurement !");
                break;

        }

        System.out.println("Your result: " + firstNum * transferValue + secMeasure);

    }





}