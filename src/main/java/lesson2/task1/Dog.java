package lesson2.task1;

public final class Dog extends LandAnimal {

    public Dog() {
        System.out.println("Вызван конструктор собаки");
    }

    @Override
    public void move() {
        System.out.println("Собака бежит.");
    }

    public void bark() {
        System.out.println("Woof!");
    }

    @Override
    public void feed() {
        System.out.println("Собака ест мясо");
    }

    public void feed(int weight) {
        System.out.println("Собака ест мясо: " + weight + " кг");
    }
}
