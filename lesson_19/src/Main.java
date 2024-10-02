import java.sql.Struct;

class Human{
    private String name;
    private String surname;
    private String middleName;
    private int age;
    Human(String name, String surname, String middleName, int age){
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.age = age;
    }
    Human(){
        name = "Jon";
        surname = "Doe";
        age = 40;
    }

    public void printHuman(){
        System.out.println("Name: " + name + "\nSurname: " + surname
                + "\nMiddle Name: " + middleName + "\nAge: " + age);
    }
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Human man = new Human();
        man.printHuman();
    }
}