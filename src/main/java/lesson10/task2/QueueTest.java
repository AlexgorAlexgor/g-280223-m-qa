package lesson10.task2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueTest {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        Queue<String> queue = new LinkedList<>();

        System.out.println("Пустая ли очередь? - " + queue.isEmpty());

        queue.add("Hello");
        queue.add("World");
        queue.add("I");
        queue.add("study");
        queue.add("Java");

        System.out.println("Пустая ли очередь? - " + queue.isEmpty());

        System.out.println(queue);

        // Метод poll удаляет элемент из начала очереди
        // (самый первый добавленный) и возвращает его
        String element = queue.poll();
        System.out.println("Извлечённый элемент - " + element);
        System.out.println(queue);

        // Метод peek возвращает элемент из начала очереди,
        // но, в отличие от метода poll, удаления этого элемента из очереди не происходит
        element = queue.peek();
        System.out.println("Извлечённый элемент - " + element);
        System.out.println(queue);
    }
}
