package lesson8.task2;

import java.util.NavigableSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class ConcurrentSkipListSetTest {

    public static void main(String[] args) {

        NavigableSet<Integer> set = new ConcurrentSkipListSet<>();

        set.add(15);
        set.add(3);
        set.add(12);
        set.add(20);
        set.add(7);
        set.add(12);

        System.out.println(set);

        // Получаем предыдущий либо следующий элемент
        System.out.println(set.lower(15));
        System.out.println(set.higher(15));

        // Удаляем первый элемент сета
        Integer value = set.pollFirst();
        System.out.println(set);
        System.out.println("Удалённый элемент - " + value);

        // Удаляем последний элемент сета
        value = set.pollLast();
        System.out.println(set);
        System.out.println("Удалённый элемент - " + value);
    }
}
