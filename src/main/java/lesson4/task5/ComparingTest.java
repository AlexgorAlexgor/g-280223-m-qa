package lesson4.task5;

public class ComparingTest {

    public static void main(String[] args) {

        int i1 = 5;
        int i2 = 5;

        System.out.println("Сравнение примитивных типов:");
        System.out.println(i1 == i2);

        Dog dog1 = new Dog(3, "Black");
        Dog dog2 = new Dog(3, "Black");

        System.out.println("Сравнение двух объектов:");
        System.out.println(dog1 == dog2);

        System.out.println("Сравнение двух объектов через equals:");
        System.out.println(dog1.equals(dog2));
    }
}