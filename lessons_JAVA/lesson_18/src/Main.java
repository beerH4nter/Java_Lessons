import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Random rnd = new Random();

    public static void playerWithRobotGame (){
        System.out.println("Welcome to the game! Robot will play with you. The robot will guess the number.");
        int humanNum = 0;
        System.out.println("Lets play!");
        int robotNum = rnd.nextInt(100) + 1;
        System.out.println("Robot said: Ok, now I'm thinking of a number from 1 to 100. Lets play!");
        do{
            System.out.println("Please enter number:");
            humanNum = scanner.nextInt();
            if(robotNum < humanNum)
                System.out.println("Robot said: My number is less than your!");
            else if(robotNum > humanNum)
                System.out.println("Robot said: My number is bigger than your!");
            else
                System.out.println("Robot said: Yeap! Its my number! Congratulations");

        }while(robotNum != humanNum);
    }


    public static void robotWithPlayerGame () {
        System.out.println("Welcome to the game! Robot will play with you. You must guess the number.");
        String gameMenu = "1.Less\n" +
                "2.Bigger\n" +
                "3.Fine! You won!\n";
        System.out.println("Guess the number for the robot from 1 to 100 to play!");
        int humanNum = scanner.nextInt();
        int robotNum = 0;
        int buffMain = 100;
        int buffSub = 1;
        do{
            robotNum = rnd.nextInt(buffSub, buffMain);
            System.out.printf("Interval: " + "[%d - %d]\n", buffSub, buffMain);
            System.out.println("Robot said: My number is " + robotNum);
            System.out.println(gameMenu);
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                    buffMain = robotNum - 1;
                    break;
                case 2:
                    buffSub = robotNum + 1;
                    break;
                case 3:
                    System.out.println("Fine! You won!");
                    break;
                default:
                    System.out.println("Wrong point!");
                    break;

            }
        }while(robotNum != humanNum);

    }
    public static void main(String[] args) {

        playerWithRobotGame();
        robotWithPlayerGame();

        System.out.println("Please enter an integer number: ");
        try{
            int num = scanner.nextInt();
        }catch(InputMismatchException ex){
            System.out.println("Your input is wrong, please enter an integer number");
        }

        int[] array = {1, 2, 3, 4, 5, 6, 7};

        try{
            for (int i = 0; i < 8; i++) {
                System.out.printf("array[%d] = %d", i, array[i]);
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("\nPlease check your array indexes");
        }

        int a = 10;
        int b = 0;
        try {
            int c = a / b;
        }catch (ArithmeticException ex){
            System.out.println("Stop! Its division by zero!");
        }


    }
}