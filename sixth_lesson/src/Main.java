import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter age: ");
//        var age = scanner.next();
//        System.out.println("Your age is " + age);

//        int x = 2;
//        int y = 3;
//        System.out.println(x > y ? "x>y" : "x<=y");
//        System.out.println("Enter x: ");
//        var x = scanner.nextInt();
//        System.out.println("Enter y: ");
//        var y = scanner.nextInt();
//        System.out.println("Enter z: ");
//        var z = scanner.nextInt();
//
//        System.out.println(x == y && y < z  ? "x and y is min" : (x < y && x == z) ? "x and z is min" : z == y && y < x
//                ? "z and y is min" : x < y && x < z ? "x is min" : y < x && y < z
//                ? "y is min" : z < x && z < y ? "z is min" : "x = y = z");

        System.out.println("Task 1:");
        System.out.println("Enter your name please:");
        String name = scanner.next();
        System.out.printf("Hello %s!\n", name);

        System.out.println("Task 2:");
        final int year = 2024;
        System.out.println("Enter your year of birth:");
        int yearOfBirth = scanner.nextInt();
        int age = year - yearOfBirth;
        System.out.println("Your age is " + age);

        System.out.println("Task 3:");
        System.out.println("Enter the side of the square");
        int squareSide = scanner.nextInt();
        System.out.println("A square perimeter: " + squareSide * 4);

        System.out.println("Task 4:");
        System.out.println("Enter the radius of the circle:");
        int radius = scanner.nextInt();
        System.out.println("The area of the circle: " + (Math.PI * Math.pow(radius, 2)));

        System.out.println("Task 5:");
        System.out.println("Enter the distance between the two cities: ");
        int distance = scanner.nextInt();
        System.out.println("Enter time:");
        int time = scanner.nextInt();
        int speed = distance/time;
        System.out.printf("The preferred speed: %d km/h\n", speed);

        System.out.println("Task 6:");
        final double euro = 0.924113;
        System.out.println("Enter quantity of dollars you want to convert:");
        double dollarsQuantity = scanner.nextDouble();
        double realMoney = dollarsQuantity * euro;
        System.out.printf("Now you have %f euros\n", realMoney);

        System.out.println("Task 7:");
        final int fileVolume = 820;
        System.out.println("Enter the volume of the flash drive: ");
        int flashVolume = scanner.nextInt();
        int flashCardMegabytes = flashVolume * 1024;
        int filesQuantity = flashCardMegabytes / fileVolume;
        System.out.printf("You can only store %d files on or usb drive\n", filesQuantity);

        System.out.println("Task 8:");
        System.out.println("Enter amount of your money(in rubles):");
        int moneyQuantity = scanner.nextInt();
        System.out.println("Enter price of one chocolate bar:");
        int chocolatePrice = scanner.nextInt();
        System.out.println("You can buy " + moneyQuantity / chocolatePrice +
                " chocolate bars " + "Your change: " + moneyQuantity % chocolatePrice);

        System.out.println("Task 9:");
        System.out.println("Enter a three-digit number for task 9:");
        int num = scanner.nextInt();
        for(int i = 0; i < 3; i ++)
        {
            System.out.print(num%10);
            num = num/10;
        }
        System.out.println();

        System.out.println("Task 10:");
        System.out.println("Enter an integer for task 10:");
        num = scanner.nextInt();
        System.out.println(num % 2 == 0 && num != 0 ? "Number is even" : num % 2 != 0 && num != 0 ? "Number is odd" : "Number = 0");

        System.out.println("Task 11:");
        System.out.println("Enter an integer for task 11:");
        num = scanner.nextInt();
        System.out.println(num > 0 ? "Number is positive" : num < 0 ? "Number is negative" : "Number = 0");

        System.out.println("Task 12:");
        System.out.println("Enter an integer for task 12:");
        num = scanner.nextInt();
        System.out.println(num % 5 == 0 && num % 7 == 0 ? "Number is multiple of 5 and 7" : "Number is not multiple of 5 and 7");

        System.out.println("Task 13:");
        int mashaApples = 10;
        int olegApples = mashaApples - 2;
        int nastyaApples = mashaApples + olegApples;
        int sashaApples = nastyaApples * 2;
        int nikitaApples = sashaApples + 5;

        System.out.printf("Nikita has %d apples, Sasha has %d apples, Nastya has %d apples, Oleg has %d apples, Masha has %d apples", nikitaApples, sashaApples, nastyaApples, olegApples, mashaApples);

    }

}
