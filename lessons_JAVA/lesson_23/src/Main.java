import models.*;

import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static final double pi = 3.1415;
    static Random rnd = new Random();
    static int size = 10;
    static int[] arr = new int[size];

    public static void printArray() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void fillArray() {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rnd.nextInt(7);
        }
    }
    public static void removeAllDuplicates() {
        int count = 0;
        int index = 0;
        int length = arr.length;
        int[] tmp = new int[length];
        tmp = arr;
        for (int i = 0; i < length; i++) {
            index = i;
            for (int j = i + 1; j < length; j++) {
                if(tmp[i] == tmp[j]){
                    count ++;
                }
            }
            if(count >= 2){
                for (int j = index; j < length; j++) {
                    if(tmp[j] == tmp[i]){
                        tmp[j] = tmp[j+1];
                        length--;
                    }
                }
            }

        }
        size = length;
        arr = tmp;

    }

    static Document doc = new Document();
    static Rectangle rec = new Rectangle(10,20);
    static Circle circle = new Circle(10,pi);
    static Multiplication multi = new Multiplication();
    static Addition add = new Addition();
    static Triangle triangle = new Triangle(10,20);
    static Square square = new Square(10,20);


    public static void main(String[] args)
    {
//        fillArray();
//        printArray();
//        removeAllDuplicates();
//        printArray();

        doc.print();
        rec.draw();
        circle.draw();
        int a = 10;
        int b = 20;
        System.out.println("a + b = " + add.operate(a, b));
        System.out.println("a * b = " + multi.operate(a, b));
        System.out.println("Area of triangle: " + (int)triangle.calculateArea());
        System.out.println("Area of rectangle: " + (int)rec.calculateArea());
        System.out.println("Area of square: " + (int)square.calculateArea());
        System.out.println("Rounded Area of circle : " + circle.calculateArea());







    }
}