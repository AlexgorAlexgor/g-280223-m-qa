package lesson8.task1;

import lesson1.task2.Dog;

import java.util.*;

public class SetTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        // Создаём сет, который хранит элементы в отсортированном виде
        SortedSet<String> set = new TreeSet<>();

        // Добавляем элементы в сет
        set.add("Watermelon");
        set.add("Banana");
        set.add("Orange");
        set.add("Apple");
        set.add("Lemon");

        // Элементы выводятся в отсортированном виде
        System.out.println(set);

        // Попытаемся добавить дубликат в сет
        boolean result = set.add("Banana");

        // Добавление дубликата не произошло
        System.out.println(set);
        System.out.println("Произошло ли добавление в сет? - " + result);

        result = set.add("Peach");
        System.out.println(set);
        System.out.println("Произошло ли добавление в сет? - " + result);

        // TreeSet не может содержать null значения
//        set.add(null);

        System.out.println("Выводим элементы сета при помощи for-each");
        for (String element : set) {
            System.out.println(element);
        }

        result = set.contains("Banana");
        System.out.println("Содержит ли сет банан? - " + result);
        result = set.contains("Cherry");
        System.out.println("Содержит ли сет вишню? - " + result);

        System.out.println("Первый элемент сета - " + set.first());
        System.out.println("Последний элемент сета - " + set.last());

        // Удалить из сета все элементы, длина которых больше 6 символов, либо которые начинаются на В

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String current = iterator.next();
            if (current.length() > 6 || current.startsWith("B")) {
                iterator.remove();
            }
        }

        System.out.println("Сет после удаления - " + set);

        // Удаляем элемент из сета
        result = set.remove("Lemon");
        System.out.println("Сет после удаления лимона - " + set);
        System.out.println("Произошло ли удаление лимона? - " + result);

        result = set.remove("Cherry");
        System.out.println("Сет после удаления вишни - " + set);
        System.out.println("Произошло ли удаление вишни? - " + result);

        // В сет мы можем добавить Apple и apple, т.к. это разные объекты (не дубликаты)
        set.add("apple");
        System.out.println(set);
    }
}
