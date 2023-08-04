package lesson7.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();

        System.out.println(list);
        list.addToHead("Hello");
        list.addToHead("World");
        list.addToHead("OK");

        list.addToTail("Java");

        System.out.println(list);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        for (Integer current : numbers) {
            System.out.println(current);
        }

        System.out.println("For-each для нашего листа:");
        for (String current : list) {
            System.out.println(current);
        }

        Iterator<String> iterator = list.iterator();
        System.out.println("Итерация нашего листа при помощи нашего итератора:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
