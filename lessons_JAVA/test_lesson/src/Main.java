import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    static Scanner scanner = new Scanner(System.in);

    static public void test2(){


        String result = "";

        System.out.println("Enter number(1 - 5000): ");
        int num = scanner.nextInt();

        int thousands = num / 1000;
        num = num % 1000;
        int hundreds = num / 100;
        num = num % 100;
        int tens = num / 10;
        num = num % 10;
        int units = num;
        //для тысяч
        if(thousands != 0){
            for (int i = 0; i < thousands; i++) {
                result += "M";
            }
        }

        //для сотен
        if(hundreds > 5 && hundreds < 9) {
            result += "D";
            for (int i = 0; i < hundreds - 5; i++) {
                result += "C";
            }

        }else if(hundreds == 5){
            result += "D";
        } else if (hundreds == 4) {
            result += "C";
            result += "D";
        } else if (hundreds < 4) {
            for (int i = 0; i < hundreds; i++) {
                result += "C";
            }
        } else if (hundreds == 9) {
            result += "C";
            result += "M";
        }

        //Для десятков
        if(tens < 4){
            for (int i = 0; i < tens; i++) {
                result += "X";
            }
        } else if (tens == 4) {
            result += "X";
            result += "L";
        } else if (tens == 5) {
            result += "L";
        } else if (tens > 5 && tens < 9) {
            result += "L";
            for (int i = 0; i < tens - 5; i++) {
                result += "X";
            }
        } else if (tens == 9) {
            result += "X";
            result += "C";
        }

        //Для единиц
        if(units < 4){
            for (int i = 0; i < units; i++) {
                result += "I";
            }
        } else if (units == 4) {
            result += "I";
            result += "V";
        } else if (units == 5) {
            result += "V";
        } else if (units > 5 && units < 9) {
            result += "V";
            for (int i = 0; i < units - 5; i++) {
                result += "I";
            }
        } else if (units == 9) {
            result += "X";
            result += "I";
        }

        System.out.println("Your roman number: " + result);

    }


    static public void test(int[]firstArray, int[]secArray, int[]resultArray){

        int firstIndex = 0;
        int secIndex = 0;
        int resultIndex = 0;

        for (int i = 0; i < firstArray.length + secArray.length; i++) {

            if((firstIndex < firstArray.length && secIndex < secArray.length &&
                    firstArray[firstIndex] < secArray[secIndex]) || secIndex == secArray.length){
                resultArray[resultIndex] = firstArray[firstIndex];
                resultIndex ++;
                firstIndex ++;

            }else {
                resultArray[resultIndex] = secArray[secIndex];
                secIndex++;
                resultIndex++;
            }

        }



    }

    public static void main(String[] args) {
        int[]firstArray = {-2, 3, 8, 9, 9, 9, 9, 20, 23, 56, 57, 87};
        int[]secArray = {-5, -1, 6, 10, 17, 19, 26};
        int[]resultArray = new int[firstArray.length + secArray.length];

        test(firstArray, secArray, resultArray);

        for (int i = 0; i < firstArray.length + secArray.length; i++) {
            System.out.print(resultArray[i] + " ");
        }

        test2();



    }
}