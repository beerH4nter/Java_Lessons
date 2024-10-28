//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int firstCount = 8;
        int secCount = 1;
        int count = 8;
        int shift = 1;
        while(firstCount <= 8 && firstCount >= 0)
        {
            while(count <= 8 && count >= 0)
            {
                System.out.print(" ");
                count --;
            }
            while (secCount > 0)
            {
                System.out.print("*");
                secCount--;
            }
            shift += 2;
            secCount = shift;
            firstCount --;
            count = firstCount;
            System.out.println();

        }

        System.out.println();

        firstCount = 7;
        secCount = 1;
        count = 1;
        while (firstCount >= 0)
        {
            while (secCount > 0)
            {
                System.out.print("*");
                secCount --;
            }
            count++;
            secCount = count;
            firstCount --;
            System.out.println();
        }

        System.out.println();

        firstCount = 7;
        secCount = 8;
        count = 8;
        while (firstCount >= 0)
        {
            while (secCount > 0)
            {
                System.out.print("*");
                secCount --;
            }
            count--;
            secCount = count;
            firstCount --;
            System.out.println();
        }


        System.out.println();

        firstCount = 8;
        secCount = 1;
        count = 1;
        System.out.println("*");
        while(firstCount >= 0)
        {
            while(secCount > 0)
            {
                System.out.print(" ");
                secCount --;
            }
            System.out.print("*");

            count ++;
            secCount = count;
            firstCount --;
            System.out.println();
        }

        System.out.println();

        firstCount = 8;
        secCount = 8;
        count = 8;
        while (firstCount >= 0)
        {
            while(secCount <= 8 && secCount >= 0)
            {
                System.out.print(" ");
                secCount --;
            }
            System.out.print("*");
            count --;
            secCount = count;
            firstCount --;
            System.out.println();
        }


        System.out.println();

        firstCount = 8;
        secCount = 1;
        count = 8;
        shift = 1;
        while(firstCount <= 8 && firstCount >= 0)
        {
            while(count <= 8 && count >= 0)
            {
                System.out.print(" ");
                count --;
            }
            while (secCount > 0)
            {
                System.out.print("*");
                secCount--;
            }
            shift += 2;
            secCount = shift;
            firstCount --;
            count = firstCount;
            System.out.println();

        }

        firstCount = 8;
        secCount = 15;
        count = -1;
        shift = 15;
        int buff = 9;
        while(firstCount <= 8 && firstCount >= 0)
        {
            while(count <= 0 && count >= -8)
            {
                System.out.print(" ");
                count ++;
            }
            while(secCount > 0)
            {
                System.out.print("*");
                secCount --;
            }
            shift -= 2;
            secCount = shift;
            firstCount--;
            count = firstCount - buff;
            System.out.println();
        }


        System.out.println();

        firstCount = 8;
        secCount = 5;
        buff =5;
        while(firstCount <= 8 && firstCount > 0)
        {
            while(secCount <= 5 && secCount > 0)
            {
                System.out.print("* ");
                secCount --;
            }
            secCount = buff;
            firstCount --;
            System.out.println();
        }


    }
}