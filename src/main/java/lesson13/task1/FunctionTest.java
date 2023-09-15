package lesson13.task1;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        // Написать функцию, которая принимает дробное число
        // и возвращает округлённое число

        // 1 способ. Создаём класс, реализуем интерфейс Function и реализуем
        // метод apply в этом классе.
        // 2 способ. Сразу реализуем метод интерфейса Function через лямбду.

        MyFunction myFunction = new MyFunction();

        System.out.println(myFunction.apply(2.34));
        System.out.println(myFunction.apply(7.52));

        Function<Double, Long> roundFunction = x -> Math.round(x);

        System.out.println(roundFunction.apply(2.34));
        System.out.println(roundFunction.apply(7.52));

        // Method reference
        Function<Double, Long> roundFunction1 = Math::round;

        System.out.println(roundFunction1.apply(2.34));
        System.out.println(roundFunction1.apply(7.52));
    }
}
