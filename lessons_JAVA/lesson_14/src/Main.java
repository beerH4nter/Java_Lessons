import java.math.BigInteger;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    static final int RAD = 1;
    static final int DEG = 0;

    static Random rnd = new Random();


    /////////////////////////////
    public static void main(String[] args)
    {

        int size = 10;
        int interval = 20;

        System.out.println("Task 1:");
        double[] arrayAngles = new double[size];
        fillArrayAngles(arrayAngles, interval);
        double sumSin = Trigonometric.getSumSinuses(arrayAngles, DEG);
        double sumCos = Trigonometric.getSumCosinuses(arrayAngles, RAD);
        double difSin = Trigonometric.getDifSinuses(arrayAngles, RAD);
        double difCos = Trigonometric.getDifCosinuses(arrayAngles, DEG);
        double compSin = Trigonometric.getComposSinuses(arrayAngles, DEG);
        double compCos = Trigonometric.getComposCosinuses(arrayAngles, RAD);
        System.out.println("Sum of sinuses: " + sumSin);
        System.out.println("Sum of cosinuses: " + sumCos);
        System.out.println("Dif of sinuses: " + difSin);
        System.out.println("Dif of cosinuses: " + difCos);
        System.out.println("Compos of sinuses: " + compSin);
        System.out.println("Compos of cosinuses: " + compCos);


        ///task 2
        ///!!!стека не хватит для реализации рекурсивного вычисления факториала миллиона, даже если выделить 1 гигабайт оперативной памяти для стека!!!
//        System.out.println("Task 2: ");
//        BigInteger num = new BigInteger("10000");
//        long timeStart = System.currentTimeMillis();
//        BigInteger fact = factorial.recursiveFactorial(num);
//        long timeEnd = System.currentTimeMillis();
//        System.out.println("Result: \n" + fact + " \nRecursive time: " + (timeEnd - timeStart));
//
//        timeStart = System.currentTimeMillis();
//        fact = factorial.simpleFactorial(1000000);
//        timeEnd = System.currentTimeMillis();
//        System.out.println("Result: \n" + fact + " \nSimple time: \n" + (timeEnd - timeStart));

        ////task 3
        System.out.println("Task 3: ");
        int[] array = new int[size];
        fillArray(array, interval);
        System.out.println("Start array: ");
        printArray(array);
        arraySort(array);
        System.out.println("Sorted array: ");
        printArray(array);
    }
    ///////////////////////////////////////////

    public static void fillArrayAngles(double[]array, int interval){
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextDouble(1, interval);
        }
    }
    public static void fillArray(int[]array, int interval){
        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(interval);
        }
    }

    public static void printArray(int[]array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void arraySort(int[]array){
        int buff = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = i + 1; j < array.length; j++) {
                if(array[i] < array[j]){
                    buff = array[i];
                    array[i] = array[j];
                    array[j] = buff;
                }
            }
        }
    }

}