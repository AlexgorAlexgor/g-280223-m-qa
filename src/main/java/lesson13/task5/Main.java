package lesson13.task5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Main {

    public static void main(String[] args) {

        // Написать метод, который на вход принимает массив и функцию.
        // Задача метода - обработать каждый элемент массива при помощи
        // переданной функции и вернуть сет получившихся элементов.

        String[] words = {"AAAA", "BBB", "CCCCC", "BBB", "DDDD"};

        System.out.println("Исходный массив - " + Arrays.toString(words));

        // Получить сет этих элементов, при этом удвоив количество букв в каждом элементе
        // "AAAA" -> "AAAAAAAA"
        Set<String> result = getSetFromArray(words, x -> x + x);
        System.out.println(result);

        // Получить сет этих элементов, при этом к каждому элементу добавить пробел и количество букв в нём
        // "AAAA" -> "AAAA 4", "CCCCC" -> "CCCCC 5"
        Set<String> result1 = getSetFromArray(words, x -> x + " " + x.length());
        System.out.println(result1);

        // Получить сет этих элементов, при этом не изменяя сами элементы
        // "AAAA" -> "AAAA"
        Set<String> result2 = getSetFromArray(words, Function.identity());
        System.out.println(result2);
    }

    public static Set<String> getSetFromArray(String[] array, Function<String, String> function) {
        Set<String> result = new HashSet<>();
        for (String element : array) {
            String processedElement = function.apply(element);
            result.add(processedElement);
        }
        return result;
    }
}