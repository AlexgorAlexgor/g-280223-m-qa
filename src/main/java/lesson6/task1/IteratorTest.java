package lesson6.task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {

    public static void main(String[] args) {

        // Создаём лист
        List<String> fruits = new ArrayList<>();

        // Наполняем лист элементами
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Peach");
        fruits.add("Orange");
        fruits.add("Pineapple");
        fruits.add("Cherry");
        fruits.add("Pear");

        // Получаем объект итератора у листа
        Iterator<String> iterator = fruits.iterator();

        // Получаем следующий элемент при помощи метода next()
        String current = iterator.next();
        System.out.println(current);

        // Получаем ещё один элемент
        String second = iterator.next();
        System.out.println(second);

        // Убедимся, что наш лист при этом не поменялся
        System.out.println(fruits);

        // Спрашиваем, остались ли ещё в листе элементы, которые мы не перебрали
        boolean nextElementExists = iterator.hasNext();
        System.out.println("Результат работы метода hasNext() - " + nextElementExists);

        // Если элементы ещё остались, то выводим в консоль следующий
        if (nextElementExists) {
            System.out.println(iterator.next());
        }

        // Выводим оставшиеся элементы листа в консоль в цикле
        System.out.println("Вывод оставшихся элементов в цикле:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("Конец работы цикла");
    }
}
