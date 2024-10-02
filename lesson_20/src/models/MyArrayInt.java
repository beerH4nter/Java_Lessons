package models;

public class MyArrayInt{
    int[] arr;
    int size;

    {
        size = 0;
        arr = new int[size];
    }


    public void addStart(int num){
        int[] tmp = new int[size+1];

        for (int i = 0; i < arr.length; i++) {
            tmp[i+1] = arr[i];
        }

        tmp[0] = num;

        arr = tmp;
        size++;
    }

    public void add(int num){
        int[] tmp = new int[size+1];

        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
        }

        tmp[size] = num;

        arr = tmp;
        size++;
    }

    public void add(int index,int num){

        if(index > arr.length){
            add(num);
        } else if (index < 0) {
            addStart(num);
        }else{
            int[] tmp = new int[size+1];
            for (int i = 0, j = 0; i < tmp.length; i++) {
                if(i == index){
                    tmp[i] = num;
                }else{
                    tmp[i] = arr[j++];
                }
            }
            arr = tmp;
            size++;
        }
    }


    public void reverse(){
        int[] tmp = new int[size];
        for (int i = 0; i < size; i++) {
            tmp[i] = arr[size - i - 1];
        }
        arr = tmp;
    }

    public void sort(boolean sortFlag){
        int buff = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = !sortFlag ? i + 1 : 0; j < arr.length; j++) {

                if (arr[i] < arr[j]) {
                    buff = arr[i];
                    arr[i] = arr[j];
                    arr[j] = buff;
                }

            }
        }

    }

    public boolean searchItem(int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                return true;
            }
        }
        return false;
    }
    public void removeByValue(int num){
        if(searchItem(num)) {
            int[] tmp = new int[size - 1];
            boolean flag = false;
            for (int i = 0, j = 0; i < arr.length; i++) {
                if( !flag && arr[i] == num){
                    flag = true;
                }else{
                    tmp[j++] = arr[i];
                }
            }
            arr = tmp;
            size--;
        }

    }
    public void printArray(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
