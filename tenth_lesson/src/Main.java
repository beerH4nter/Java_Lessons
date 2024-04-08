//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] array ={-2,-12,-1,-84,-23,-50,-9,-65,-5,-1};

        int max = array[0];

        for (int i = 1; i < array.length; i++)
        {
            if (array[i] > max)
                max = array[i];
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println(max);


    }
}