package lesson5.task2;

import java.util.ArrayList;
import java.util.List;

public class ListChange {

    public static void main(String[] args) {

        // Есть лист чисел. Нужно каждое число умножить на 2.
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        System.out.println(numbers);

        List<Integer> result = multiplyList(numbers);
        System.out.println(result);

        // Получить лист из исходного листа, содержащий только нечётные числа
        List<Integer> result1 = filterList(numbers);
        System.out.println(result1);

        // Получить сумму всех элементов листа
        int sum = getSumOfList(numbers);
        System.out.println("Сумма - " + sum);
    }

    public static int getSumOfList(List<Integer> source) {
        int sum = 0;
        for (Integer current : source) {
            sum += current;
        }
        return sum;
    }

    public static List<Integer> filterList(List<Integer> source) {
        List<Integer> result = new ArrayList<>();
        for (Integer current : source) {
            if (current % 2 != 0) {
                result.add(current);
            }
        }
        return result;
    }

    public static List<Integer> multiplyList(List<Integer> source) {
        List<Integer> result = new ArrayList<>();
//        for (Integer current : source) {
//            result.add(current * 2);
//        }
        for (int i = 0; i < source.size(); i++) {
            result.add(source.get(i) * 2);
        }
        return result;
    }
}
