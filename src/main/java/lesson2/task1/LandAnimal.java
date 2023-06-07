package lesson2.task1;

public abstract class LandAnimal extends Animal {

    public LandAnimal() {
        super();
        System.out.println("Вызван конструктор сухопутного животного");
    }

    public abstract void move();

    @Override
    public void feed() {
        System.out.println("Животное питается");
    }
}
