package lesson12.task2;

import lesson9.task1.Cat;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerTest {

    public static void main(String[] args) {

        Consumer<String> consumer = x -> System.out.println("Привет, " + x + "!");

        consumer.accept("Иван");
        consumer.accept("Сидор");
        consumer.accept("Марина");

        Consumer<Cat> catConsumer = x -> System.out.println("Это кот с возрастом - " + x.getAge());

        Cat cat = new Cat(4, "Black", 5);

        catConsumer.accept(cat);
    }
}
