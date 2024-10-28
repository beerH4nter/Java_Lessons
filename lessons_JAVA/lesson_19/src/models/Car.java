package models;

public class Car {


    private String brand;
    private String model;
    private int year;
    private int horsepower;

    private int price;

    Car() {

    }


    Car(String brand, String model, int year, int horsepower, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.horsepower = horsepower;
        this.price = price;
    }

    public void printInfo() {
        System.out.println("Brand: " + brand + "\nModel: " + model +
                "\nYear: " + year + "\nhorsepower: " + horsepower + "\nprice: " + price + "\n");
    }


    public static void main(String[] args) {
        Car firstCar = new Car("BMW", "X5(G05)", 2018, 265 , 16600000);
        Car secCar = new Car("Mercedes", "AMG ONE", 2022 , 1000, 300000000);

        firstCar.printInfo();
        secCar.printInfo();

    }
}






//Создайте класс Книга (Book) с использованием Java:*
//
//        1. Определите поля:
//        - Название книги (title)
//   - Автор книги (author)
//   - Год издания (year)
//   - Жанр (genre)
//   - Количество страниц (numPages)
//
//2. Создайте конструкторы:
//        - Конструктор без параметров.
//   - Конструктор, который принимает название книги, автора и год издания в качестве параметров.
//        - Конструктор, который принимает все поля книги в качестве параметров.
//
//        3. Реализуйте методы:
//        - Метод printInfo(), который выводит информацию о книге в консоль.
//
//        4. Создайте 3 объекта класса Книга и протестируйте их, вызывая printInfo().
//
//напишите мне еще 2 класса

