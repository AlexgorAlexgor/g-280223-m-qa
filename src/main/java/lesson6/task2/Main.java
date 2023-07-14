package lesson6.task2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        // Наполняем лист элементами
        fruits.add("Banana");
        fruits.add("Peach");
        fruits.add("Orange");
        fruits.add("Apple");
        fruits.add("Apricot");
        fruits.add("Pineapple");
        fruits.add("Cherry");
        fruits.add("Pear");

        // Для чтения коллекции и одновременного её изменения
        // циклы нам не подходят
//        for (int i = 0; i < fruits.size(); i++) {
//            if (fruits.get(i).startsWith("A")) {
//                fruits.remove(i);
//            }
//        }

//        for (String elem : fruits) {
//            if (elem.startsWith("A")) {
//                fruits.remove(elem);
//            }
//        }
//
        // Верным решением в данном случае будет итератор
        Iterator<String> iterator = fruits.iterator();

        // При помощи итератора удаляем все элементы листа, которые начинаются с А
        while (iterator.hasNext()) {
            if (iterator.next().startsWith("A")) {
                iterator.remove();
            }
        }

        System.out.println(fruits);
    }
}
