package lesson6.task3;

import java.util.Enumeration;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        // Создаём Vector - устаревшая аналогия листа
        Vector<String> vector = new Vector<>();

        // Наполняем элементами
        vector.add("Banana");
        vector.add("Apricot");
        vector.add("Pineapple");
        vector.add("Melon");
        vector.add("Peach");

        // У вектора получаем устаревший итератор Enumeration
        // Метод elements() является аналогом метода iterator()
        Enumeration<String> enumer = vector.elements();

        // В цикле выводим все элементы в консоль
        // Метод hasMoreElements() является аналогом метода hasNext()
        // Метод nextElement() является аналогом метода next()
        while (enumer.hasMoreElements()) {
            System.out.println(enumer.nextElement());
        }
    }
}