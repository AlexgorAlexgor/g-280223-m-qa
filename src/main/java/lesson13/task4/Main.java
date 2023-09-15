package lesson13.task4;

import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        Function<String, String> function = Function.identity();

        System.out.println(function.apply("Привет!"));

        Function<String, String> function1 = x -> x;

        System.out.println(function1.apply("Привет!"));

        // А зачем нам нужна функция, которая вообще ничего не делает?
        // Ответ в следующем примере.
    }
}
