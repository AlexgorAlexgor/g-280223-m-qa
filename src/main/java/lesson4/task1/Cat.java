package lesson4.task1;

public class Cat {

    // Поля объекта.
    // Они объявлены внутри класса, но не внутри метода.
    // Уничтожаются вместе с уничтожением самого объекта.
    private int age;
    private String color;

    public Cat(int age) {
        this.age = age;
    }

    public void test() {
        // Локальные переменные.
        // Они объявлены внутри метода.
        // Уничтожаются тогда, когда закончит работу метод,
        // внутри которого они объявлены.
        int size = 5;
        Cat cat = new Cat(7);
    }
}