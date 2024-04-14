import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static Random rnd = new Random();
    public static void printArray(int[]array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    public static  void simpleSort(int[]array)
    {
        int buff = 0;

        for(int i = 0; i < array.length; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                if(array[i] > array[j])
                {
                    buff = array[i];
                    array[i] = array[j];
                    array[j] = buff;
                }
            }
        }
    }

    public static void bubbleSort(int[]array)
    {
        int buff = 0;
        for (int i = 1; i < array.length; i++)
        {
            for (int j = 0; j < array.length - i; j++)
            {
                if(array[j] > array[j + 1])
                {
                    buff = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = buff;
                }
            }
        }
    }

    public static void fillArray(int[]array)
    {
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(30);
        }
    }

    public static void main(String[] args)
    {

        System.out.println("Task 1");
        int[][] matrix = new int[8][8];
        for (int i = 0; i < matrix.length; i++)
        {
            fillArray(matrix[i]);
        }

        for (int i = 0; i < matrix.length; i++)
        {
            printArray(matrix[i]);
            System.out.println();
        }

        System.out.println("\nTask 2");

        for (int i = 0; i < matrix.length; i++)
        {
            fillArray(matrix[i]);
        }

        System.out.println("\nMatrix: ");
        for (int i = 0; i < matrix.length; i++)
        {
            printArray(matrix[i]);
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                System.out.print(matrix[(matrix.length - 1) - i][(matrix.length - 1) - j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nTask 3");
        for (int i = 0; i < matrix.length; i++)
        {
            fillArray(matrix[i]);
        }
        System.out.println();

        int j = 0;
        int count = 1;
        for (int k = 0; k < matrix.length * matrix.length; k++)
        {
            System.out.print(matrix[count - 1][j] + " ");
            j++;
            if(k == (matrix.length * count) - 1)
            {
                j = 0;
                count++;
                System.out.println();
            }

        }

        System.out.println("\nTask 4");
        for (int i = 0; i < matrix.length; i++)
        {
            fillArray(matrix[i]);
        }
        System.out.println();

        System.out.println("Simple matrix: ");
        for (int i = 0; i < matrix.length; i++)
        {
            printArray(matrix[i]);
            System.out.println();
        }

        for (int i = 0; i < matrix.length; i++)
        {
            for (int k = 0; k < matrix.length; k++)
            {
                if(matrix[i][j] % 2 == 0 && matrix[i][j] % 5 == 0)
                {
                    matrix[i][j] = 999;
                }
            }
        }
        System.out.println("\nMatrix after swap: ");
        for (int i = 0; i < matrix.length; i++)
        {
            printArray(matrix[i]);
            System.out.println();
        }





    }
}