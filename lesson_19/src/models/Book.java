package models;

public class Book {
    private String title;
    private String author;
    private int year;
    private String genre;

    private int numPages;

    Book() {

    }

    Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }


    Book(String title, String author, int year, String genre, int numPages) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.numPages = numPages;
    }

    public void printInfo() {
        System.out.println("Title: " + title + "\nAuthor: " + author +
                "\nYear: " + year + "\nGenre: " + genre + "\nNumber of pages: " + numPages + "\n");
    }


    public static void main(String[] args) {
        Book firstBook = new Book("War and Piece", "Lev Nikolaevich Tolstoy", 1869, "Epic novel", 2160);
        Book secBook = new Book("The Call of the Wild", "Jack London", 1903, "Adventure novel", 106);
        Book thirdBook = new Book("Atlas Shrugged", "Ayn Rand", 1957, "Dystopian novel", 1398);

        firstBook.printInfo();
        secBook.printInfo();
        thirdBook.printInfo();

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