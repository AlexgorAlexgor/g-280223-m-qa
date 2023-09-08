package lesson12.task3;

import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        Function<Integer, Double> function = x -> (double) x / 2;

        double result = function.apply(10);
        System.out.println(result);

        result = function.apply(9);
        System.out.println(result);
    }
}
