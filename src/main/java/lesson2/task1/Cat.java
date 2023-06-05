package lesson2.task1;

public class Cat extends LandAnimal {

    public Cat() {
        System.out.println("Вызван конструктор кошки");
    }

    @Override
    public void move() {
        System.out.println("Кошка бежит.");
    }
}
