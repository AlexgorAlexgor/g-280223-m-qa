package lesson2.task1;

public class Bird extends Animal implements Flyable {
    @Override
    public void feed() {
        System.out.println("Птица клюёт корм");
    }

    @Override
    public void fly() {
        System.out.println("Птица летит");
    }
}
