package lesson1.task1;

public class Dog {

    String breed;
    private int age;
    int id;
    String color;
    double weight;

    public Dog() {
        System.out.println("Вызван конструктор класса Dog");
    }

    public Dog(int age) {
        this.age = age;
    }

    public Dog(int age, int id) {
        this.id = id;
        this.age = age;
    }

    public Dog(int value, String value1) {

    }

    public Dog(String value, double weight) {
        this.breed = value;
        this.weight = weight;
    }

    public Dog(String breed, int age, int id, String color, double weight) {
        this.breed = breed;
        this.age = age;
        this.id = id;
        this.color = color;
        this.weight = weight;
        sleep();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Ошибка! Возраст не может быть отрицательным!");
            age = 0;
        }
        this.age = age;
    }

    public void sleep() {
        System.out.println("Собака спит");
    }

    public void eat() {
        System.out.println("Собака ест");
    }
}