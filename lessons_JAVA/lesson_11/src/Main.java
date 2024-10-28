//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        int summary = MathOperations.sum(5, 10);
        int dif = MathOperations.difference(30, 27);
        int prod = MathOperations.product(7,8);
        double div = MathOperations.division(2,5);

        System.out.printf("Sum: %d; Dif: %d; Prod: %d; Div: %f", summary, dif, prod, div);
    }
}