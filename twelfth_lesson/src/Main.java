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
            array[i] = rnd.nextInt(20);
        }
    }

    public static void main(String[] args)
    {

//        int[] array = new int[10];
//
//        fillArray(array);
//
//        System.out.println("Array:");
//        printArray(array);
//
//        simpleSort(array);
//
//        System.out.println("\nAfter simple sort: ");
//        printArray(array);
//
//        fillArray(array);
//
//        System.out.println("\nArray: ");
//        printArray(array);
//
//        bubbleSort(array);
//
//        System.out.println("\nAfter bubble sort: ");
//        printArray(array);



        int[][] matrix = new int[6][6];

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                matrix[i][j] = rnd.nextInt(20);
            }
        }

        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


        int[] array = new int[36];

        int count = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                array[count] = matrix[i][j];
                count++;
            }
        }

        System.out.println();
        System.out.println("\nNew array: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        int buff = 0;
        for (int i = 0; i < array.length; i++)
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

        System.out.println();
        System.out.println("\nSorted new array: ");
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }

        count = 0;
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                matrix[i][j] = array[count];
                count++;
            }
        }

        System.out.println();
        System.out.println("\n Sorted matrix");
        for (int i = 0; i < matrix.length; i++)
        {
            printArray(matrix[i]);
            System.out.print("    ");
            System.out.println();
        }





    }
}