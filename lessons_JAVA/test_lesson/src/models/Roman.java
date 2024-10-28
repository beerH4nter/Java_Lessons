package models;

import java.util.Scanner;

public class Roman {

    static Scanner scanner = new Scanner(System.in);
    public static String convertToRoman(int num){

        String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I",};
        int[] numbers = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String result = "";
        int i = 0;
        while (num > 0){
            while (num>=numbers[i]){
                num -= numbers[i];
                result += romans[i];
            }
            i++;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.print("Enter num to convert: ");
        int number = scanner.nextInt();
        System.out.println("Your roman number: " + convertToRoman(number));
    }

}

