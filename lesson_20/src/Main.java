import models.MyArrayInt;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MyArrayInt myArrayInt = new MyArrayInt();
        myArrayInt.add(10);
        myArrayInt.add(20);
        myArrayInt.add(99);
        myArrayInt.add(30);
        myArrayInt.add(7);
        myArrayInt.add(4);
        myArrayInt.add(22);
        myArrayInt.add(99);

//        myArrayInt.add(2, 77);
        myArrayInt.printArray();
        myArrayInt.removeByValue(99);
        myArrayInt.printArray();

    }
}