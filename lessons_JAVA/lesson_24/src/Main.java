//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    static int size = 11;
    static int[] arr = new int[size];

    public static void copy(int length) {
        int[]result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = arr[i];
        }
        size = length;
        arr = result;

    }
    public static void removeAllDuplicates(){
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
                if(arr[i] == arr[j]){
                   int shift = j;
                    for (int k = j+1; k < length; k++, shift++) {
                        arr[shift] = arr[k];
                    }
                    length--;
                    j--;
                }
            }
        }
        copy(length);

    }

    public static void print() {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //arr = {10,20,20,99,30,30,30,7,4,22,20};
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 20;
        arr[3] = 99;
        arr[4] = 30;
        arr[5] = 30;
        arr[6] = 30;
        arr[7] = 7;
        arr[8] = 4;
        arr[9] = 22;
        arr[10] = 20;
        print();
        removeAllDuplicates();
        print();

    }
}