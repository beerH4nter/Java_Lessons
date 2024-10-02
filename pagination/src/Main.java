import models.Site;

import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Site site = new Site();

        for (int i = 0; i < 10; i++) {
            site.addPage();
        }


        boolean flag = true;
        int selectedPage = 1;
        do {
            System.out.println("Page №" + selectedPage);
            site.showPage(selectedPage);
            System.out.println("Choose an option: <--prev page> <exit> <next page--> (<0> <1> <2>)");
            int point = scanner.nextInt();
            switch (point){
                case 0:
                    if(selectedPage == 1){
                        System.out.println("No pages found");
                    }else {
                        selectedPage--;
                    }
                    break;
                case 1:
                    flag = false;
                    break;
                case 2:
                    if (selectedPage == 10){
                        System.out.println("No pages found");
                    }else {
                        selectedPage++;
                    }
                    break;
                default:
                    System.out.println("No option found");
                    break;
            }
        }while(flag);

    }
}