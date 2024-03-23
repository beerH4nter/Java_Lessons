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
        System.out.println("Enter x: ");
        var x = scanner.nextInt();
        System.out.println("Enter y: ");
        var y = scanner.nextInt();
        System.out.println("Enter z: ");
        var z = scanner.nextInt();

        System.out.println(x == y && y < z  ? "x and y is min" : (x < y && x == z) ? "x and z is min" : z == y && y < x
                ? "z and y is min" : x < y && x < z ? "x is min" : y < x && y < z
                ? "y is min" : z < x && z < y ? "z is min" : "x = y = z");

    }
}
