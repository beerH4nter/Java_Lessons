import models.Human;

class Student extends Human {
    private int stipend;

    public void setStipend(int stipend) {
        this.stipend = stipend;
    }
    public int getStipend() {
        return stipend;
    }

    public Student(){}
    public Student(String name, int age, int stipend){
        super(name, age);
        this.stipend = stipend;
    }

    @Override
    public void action(){
        System.out.println("I'm hungry(");
    }

}

public class Main {
    public static void main(String[] args) {
        Student student = new Student("artyom", 21, 3500);

        System.out.println(student.getName() + " " + student.getAge() + " " + student.getStipend());
        student.action();


    }
}