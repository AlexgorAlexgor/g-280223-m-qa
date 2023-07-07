package lesson5.task1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListTest {

    public static void main(String[] args) {

        int[] array = new int[5];

        // Создаём лист
        List<String> list = new ArrayList<>();

        // Добавляем элементы в лист
        list.add("Banana");
        list.add("Orange");
        list.add("Peach");

        // Выводим лист в консоль
        System.out.println(list);

        // Добавляем элемент в лист по индексу
        list.add(1, "Cherry");

        System.out.println(list);

        // Выводим в консоль размер листа
        System.out.println("Размер листа - " + list.size());

        // Получение элемента листа
        System.out.println("Элемент листа по индексу 2 - " + list.get(2));

        // Заменяем элемент листа и помещаем заменённый элемент в отдельную переменную
        String element = list.set(1, "Lemon"); // Теперь в переменной element содержится значение Cherry
        System.out.println(list);
        System.out.println("Заменённый элемент - " + element);
        list.add(1, element);
        System.out.println(list);

        // Удаляем элемент из листа
        list.remove(1);
        System.out.println(list);

        // Удаляем элемент из листа и помещаем удалённый элемент в переменную
        String deletedElement = list.remove(2); // Теперь переменная deletedElement содержит удалённый элемент Orange
        System.out.println(list);
        System.out.println("Удалённый элемент - " + deletedElement);

        // Удаляем конкретный элемент из листа
        list.remove("Banana");
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("Tomato");
        list1.add("Carrot");
        list1.add("Potato");

        // Добавляем элементы одного листа в другой лист
        list.addAll(list1);
        System.out.println(list);

        // Добавляем элементы одного листа в другой лист по индексу
        list.addAll(1, list1);
        System.out.println(list);

        // Удалить все помидоры
//        list.remove("Tomato"); Такой способ позволяет удалить только один первый попавшийся объект
        List<String> forDelete = List.of("Tomato", "Carrot");
        System.out.println("Лист list - " + list);
        System.out.println("Лист forDelete - " + forDelete);
        // Метод removeAll удаляет из list все элементы, которые содержатся в forDelete
        list.removeAll(forDelete); // А таким способом мы удаляем все такие объекты из листа
        System.out.println(list);

        boolean deletionResult = list.remove("Potato");
        System.out.println(list);
        System.out.println("Был ли удалён картофель? - " + deletionResult);

        deletionResult = list.remove("Tomato");
        System.out.println(list);
        System.out.println("Был ли удалён помидор? - " + deletionResult);

        System.out.println("Пустой ли лист? - " + list.isEmpty());

        // Получаем индекс определённого элемента
        System.out.println("Индекс картофеля - " + list.indexOf("Potato"));
        System.out.println("Индекс помидора - " + list.indexOf("Tomato"));

        // Проверяем, существует ли элемент в списке
        System.out.println("Есть ли в листе картофель - " + list.contains("Potato"));
        System.out.println("Есть ли в листе ананас - " + list.contains("Pineapple"));

        // Очищаем лист
        list.clear();
        System.out.println("Размер листа - " + list.size());
        System.out.println("Лист - " + list);
    }
}
