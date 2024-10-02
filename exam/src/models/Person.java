package models;

import java.time.LocalTime;
import java.util.Objects;

public class Person {
    private String surname;
    private String name;
    private String phone;
    private int age;
    private LocalTime creationTime;

    public Person(String surname, String name, String phone, int age) {
        this(surname, name, phone, age, LocalTime.now().toString());
    }

    public Person(String surname, String name, String phone, int age, String creationTime) {
        this.surname = surname;
        this.name = name;
        this.phone = phone;
        this.age = age;
        this.creationTime = LocalTime.parse(creationTime);
    }

    public Person() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(name, person.name) &&
                Objects.equals(phone, person.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, name, phone, age);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %d %s", surname, name, phone, age, creationTime);
    }
}
