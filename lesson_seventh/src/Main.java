//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args)
    {
        int countFifteenMultiple = 0;
        int countTwoAndFiveMultiple = 0;
        int countOfEven = 0;
        for (int i = 1; i < 101; i++)
        {
            if(i % 2 == 0)
            {
                countOfEven ++;
                if(i % 5 == 0)
                    countTwoAndFiveMultiple ++;
            }
            if (i % 15 == 0)
                countFifteenMultiple ++;

        }

        System.out.println("Count of even: " + countOfEven + "\nCount of 2 and 5 multiple: " + countTwoAndFiveMultiple + "\nCount of 15 multiple: " + countFifteenMultiple);


        for (int i = 0; i < 15; i++)
        {
            for (int j = 0; j < 15; j++)
            {
                System.out.print("  *");
            }
            System.out.println();
        }
    }
}