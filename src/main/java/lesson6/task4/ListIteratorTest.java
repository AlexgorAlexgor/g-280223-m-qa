package lesson6.task4;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Apricot");
        fruits.add("Peach");
        fruits.add("Orange");
        fruits.add("Lemon");
        fruits.add("Pear");
        fruits.add("Cherry");

        // Задача: Вывести элементы листа с начала до апельсина, удалить апельсин,
        // на это место добавить арбуз,
        // после этого вывести элементы с этого же места в обратной последовательности

        System.out.println(fruits);

        // Получаем объект лист итератора у нашего листа
        ListIterator<String> iterator = fruits.listIterator();

        // Проходим циклом по листу в прямом направлении
        while (iterator.hasNext()) {

            // Получаем следующий элемент нашего листа
            String current = iterator.next();
            // Выводим элемент в консоль
            System.out.println(current);

            // Если элемент является апельсином, удаляем его
            // и прерываем цикл, т.к. по условию задачи мы должны здесь остановиться
            if (current.equals("Orange")) {
                iterator.remove();
                break;
            }
        }

        // Добавляем арбуз. Добавление происходит в то место,
        // где находится в данный момент итератор
        iterator.add("Watermelon");

        // Идём в обратном направлении
        // Обход начнётся с того места, где в данный момент находится итератор
        while (iterator.hasPrevious()) {
            // Выводим в консоль каждый предыдущий элемент
            System.out.println(iterator.previous());
        }
        System.out.println(fruits);

        for (int i = fruits.size() - 1; i >= 0; i--) {
            System.out.println(fruits.get(i));
        }
    }
}
