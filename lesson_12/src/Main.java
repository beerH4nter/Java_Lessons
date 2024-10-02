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

        int[][] matrix = new int[6][6];
        for (int i = 0; i < matrix.length; i++)
        {
            fillArray(matrix[i]);
        }

        for (int i = 0; i < matrix.length; i++)
        {
            printArray(matrix[i]);
            System.out.println();
        }

        int max = matrix[0][0];
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix.length; j++)
            {
                if(matrix[i][j] > max)
                    max = matrix[i][j];
                else if(matrix[i][j] < min)
                    min = matrix[i][j];
            }
        }

        System.out.println("Max: " + max + " Min: " + min);

    }
}