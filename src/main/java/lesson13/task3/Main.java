package lesson13.task3;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        // На вход в функцию подаётся число в строковом формате.
        // 1. Преобразовать строку в число.
        // 2. Округлить это число.
        // 3. Возвести число в квадрат.

        // "4.76" -> 25
        // String -> Long

        Function<String, Long> function = x -> {
            double result1 = Double.parseDouble(x);
            long result2 = Math.round(result1);
            double result3 = Math.pow(result2, 2);
            return (long) result3;
        };

        String initialValue = "4.76";
        System.out.println(function.apply(initialValue));

        Function<String, Long> function1 = x -> (long) Math.pow(Math.round(Double.parseDouble(x)), 2);

        System.out.println(function1.apply(initialValue));

        // На вход в функцию подаётся число в строковом формате.
        // 1. Преобразовать строку в число.
        // 2. Округлить это число.
        // 3. Возвести число в квадрат.

        Function<String, Double> firstFunc = x -> Double.parseDouble(x);
        Function<Double, Long> secondFunc = x -> Math.round(x);
        Function<Long, Long> thirdFunc = x -> x * x;

        Function<String, Long> totalFunc = firstFunc.andThen(secondFunc).andThen(thirdFunc);

        System.out.println(totalFunc.apply(initialValue));

        Function<String, Long> totalFunc1 = secondFunc.andThen(thirdFunc).compose(firstFunc);

        System.out.println(totalFunc1.apply(initialValue));
    }
}
