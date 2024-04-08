import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Random rnd = new Random();
    public static void fillArray(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            array[i] = rnd.nextInt(60);
        }
    }
    public static void printArray(int[] array)
    {
        System.out.println("Array: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.printf("[%d]", array[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Task1
        int[] array = new int[40];

        System.out.println("Task 1");
        fillArray(array);

        for (int i = 0; i < array.length; i++)
        {
            System.out.printf("[%d]", array[i]);
        }

        System.out.println();

        //task2
        System.out.println("Task 2");
        fillArray(array);

        System.out.println("Forward: ");
        printArray(array);
        System.out.println("\nBackward: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.printf("[%d]", array[array.length - i - 1]);
        }

        //task3
        System.out.println("\nTask 3");
        fillArray(array);

        int sum = 0;
        printArray(array);

        for (int i = 0; i < array.length; i++)
        {
            sum += array[i];
        }
        System.out.println("\nSum: " + sum);

        //task4
        System.out.println("Task 4");
        fillArray(array);
        printArray(array);

        int sumOfEven = 0;

        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 2 == 0)
                sumOfEven += array[i];
        }

        System.out.println("\nSum of even in array: " + sumOfEven);

        //task5

        System.out.println("Task 5");
        fillArray(array);
        printArray(array);
        int sumOfFourMultiple = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 4 == 0)
                sumOfFourMultiple += array[i];
        }
        System.out.println("\nSum of even and 4 multiple: " + sumOfFourMultiple);

        //task6

        System.out.println("Task 6");
        fillArray(array);
        printArray(array);

        int value = 0;
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] % 3 == 0 && array[i] % 5 == 0 && array[i] % 2 == 0)
                value += array[i];
        }
        System.out.println("\nSum of even and 3 and 5 multiple: " + value);

        //task7
        System.out.println("Task 7");
        System.out.println("Enter array size: ");
        int size = scanner.nextInt();
        int[] newArray = new int[size];
        fillArray(newArray);
        printArray(newArray);

        //task 8
        System.out.println("\nTask 8");
        System.out.println("Enter array size: ");
        size = scanner.nextInt();
        int[] handMadeArray = new int[size];

        System.out.println("Enter elements of array: ");
        for (int i = 0; i < handMadeArray.length; i ++)
        {
            handMadeArray[i] = scanner.nextInt();
        }

        printArray(handMadeArray);

        //task 9
        System.out.println("\nTask 9");
        fillArray(array);
        printArray(array);

        int max = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println("\nMax element: " + max);

        //task 10
        System.out.println("\nTask 10");
        fillArray(array);
        printArray(array);

        int min = array[0];
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("\nMin element: " + min);
    }
}