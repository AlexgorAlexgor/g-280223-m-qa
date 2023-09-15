package lesson13.task2;

import java.util.function.Function;

public class ConvertTypes {

    public static void main(String[] args) {

        // Есть объект собаки.
        // Нужно преобразовать объект собаки в объект кошки,
        // при этом уменьшив вес животного в два раза.

        Dog dog = new Dog(3, "Black", 8.64);

        // 1. Создать объект кошки
        // 2. Значения параметров кошки взять из объекта собаки
        // 3. Вес нужно уменьшить вес в два раза

        Function<Dog, Cat> dogToCat = x -> new Cat(x.getAge(), x.getColor(), x.getWeight() / 2);

        System.out.println("Исходная собака: " + dog);

        Cat cat = dogToCat.apply(dog);

        System.out.println("Получившаяся кошка: " + cat);
    }

//    public static Cat apply(Dog dog) {
//        return new Cat(dog.getAge(), dog.getColor(), dog.getWeight() / 2);
//    }
}
