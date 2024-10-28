import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static Double add(double a, double b){
        return a + b;
    }

    public static Double dif(double a, double b){
        return a - b;
    }

    public static Double div(double a, double b){
        double result = 0;
        if(b != 0){
            result += a / b;
            result += a % b;
        }
        else{
            System.out.println("Error! Division by zero");
        }
        return result;
    }

    public static Double compos(double a, double b){
        return a * b;
    }

    public static ArrayList<Object> expressionList(String expression){
        ArrayList<Object> listForExpression = new ArrayList<>();
        String firstNum = "";
        String secNum = "";
        char sign;

        int i = 0;
        while (expression.charAt(i) != ' ') {
            firstNum += expression.charAt(i);
            i++;
        }
        i ++;
        sign = expression.charAt(i);
        i += 2;
        while (i != expression.length()) {
            secNum += expression.charAt(i);
            i++;
        }
        listForExpression.add(firstNum);
        listForExpression.add(sign);
        listForExpression.add(secNum);
        return listForExpression;
    }

    public static void calc(){
        int calcOrExitPoint;
        boolean flag = true;
        String expression;
        ArrayList<Object> listForExpression = new ArrayList<>();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter expression(as example: 2 + 2): ");
            expression = scanner.nextLine();
            listForExpression = expressionList(expression);
            int resultInt = 0;
            Double resultDouble = 0.0;

            switch (listForExpression.get(1).toString()) {
                case "+":
                    resultDouble = add(Double.parseDouble(listForExpression.get(0).toString()), Double.parseDouble(listForExpression.get(2).toString()));
                    break;
                case "-":
                    resultDouble = dif(Double.parseDouble(listForExpression.get(0).toString()), Double.parseDouble(listForExpression.get(2).toString()));
                    break;
                case "*":
                    resultDouble = compos(Double.parseDouble(listForExpression.get(0).toString()), Double.parseDouble(listForExpression.get(2).toString()));
                    break;
                case "/":
                    resultDouble = div(Double.parseDouble(listForExpression.get(0).toString()), Double.parseDouble(listForExpression.get(2).toString()));
                    break;
                default:
                    System.out.println("Wrong operation sign! Try again!");
                    flag = false;
                    break;
            }

            if(resultDouble % 1 == 0) {
                System.out.println(expression + " = " + resultDouble.intValue());
            }
            else {
                System.out.println(expression + " = " + resultDouble);
            }


            System.out.println("Enter 0 to exit and 1 to continue calculating");
            calcOrExitPoint = scanner.nextInt();
            if(calcOrExitPoint == 1)
                flag = false;
            else
                flag = true;
        }while(!flag);



    }


    public static void main(String[] args){

        calc();

    }
}