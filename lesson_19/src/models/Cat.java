package models;

public class Cat {


    private String name;
    private int age;
    private String breed;
    private String color;

    Cat() {

    }


    Cat(String name, int age, String breed, String color) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    public void meow(){
        if(age >= 3 && age <= 6){
            System.out.println(name + " Said: Meow(^ w ^)");
        } else if (age >= 7) {
            System.out.println(name + " Said: Meeoooow(- w -)");
        } else if (age <= 2) {
            System.out.println(name + " Said: Mew(- ~ -)");
        }
    }
    public void printInfo() {
        System.out.println("Name: " + name + "\nAge: " + age +
                "\nBreed: " + breed + "\nColor: " + color + "\n");
    }


    public static void main(String[] args) {
        Cat firstCat = new Cat("Cherry", 3, "Mayn-Kun", "Grey");
        Cat secCat = new Cat("Max", 11, "Britain" , "Grey");

        firstCat.printInfo();
        secCat.printInfo();
        firstCat.meow();
        secCat.meow();
    }
}


