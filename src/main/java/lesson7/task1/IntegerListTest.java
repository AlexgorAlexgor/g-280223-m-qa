package lesson7.task1;

import java.util.ArrayList;
import java.util.List;

public class IntegerListTest {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(7);
        numbers.add(6);
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);

        System.out.println(numbers);
        Integer integer = 3;

        // Удаление конкретного объекта со значением 3
        numbers.remove(integer);

        // Удаление элемента листа по индексу 3
        numbers.remove(3);

        System.out.println(numbers);
    }
}
