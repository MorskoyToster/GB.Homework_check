package ru.geekbrains.java_one.lesson_2.Verhovskii_IA;

public class Staff {
    //По принципу инкапсуляции надо ли было дефолтные переменные запихивать в приватный модификатор и при этом делать какие-то перемещения классов?
    String fullName;
    String position;
    String phoneNumber;
    int salary;
    int age;

    Staff(String fullName, int age) {
        this.fullName = fullName;
        this.position = "CEO";
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    Staff(String fullName, String position, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = "Trainee";
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    Staff(String fullName, int age, String phoneNumber) {
        this.fullName = fullName;
        this.position = "Backend programmer";
        this.salary = salary;
    }

    Staff(String fullName, String phoneNumber, int salary) {
        this.fullName = fullName;
        this.position = "QA Tester";
        this.age = age;
    }
    public String getFullName() {
        return fullName;
    }
    public String getPosition() {
        return position;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public int getSalary() {
        return salary;
    }
    public int getAge() {
        return age;
    }
}

