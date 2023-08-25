package lesson10.task1;

import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        System.out.println("Пустой ли стек? - " + stack.empty());

        // Добавляем элементы в стек
        stack.push("Hello");
        stack.push("World");
        stack.push("I");
        stack.push("study");

        // Метод возвращает нам добавляемый элемент,
        // поэтому мы можем записать его в переменную
        String addedElement = stack.push("Java");

        System.out.println(stack);

        System.out.println("Мы добавили в стек этот элемент - " + addedElement);

        // В отличие от метода push, метод add возвращает нам
        // boolean результат, true - если добавление произошло успешно
        boolean result = stack.add("Apple");

        System.out.println(stack);

        // Мы можем выполнять различные действия в зависимости
        // от результата добавления элемента в стек
        if (result) {
            System.out.println("Добавление произошло успешно");
        } else {
            System.out.println("Ошибка! Добавление не произошло");
        }

        // Метод pop удаляет элемент с вершины стека (который был добавлен последним)
        // и возвращает его нам
        String element = stack.pop();
        System.out.println("Извлечённый элемент - " + element);
        System.out.println(stack);

        // Метод peek возвращает нам элемент с вершины стека,
        // но, в отличие от метода pop, не удаляет его из стека
        element = stack.peek();
        System.out.println("Извлечённый элемент - " + element);
        System.out.println(stack);

        System.out.println("Пустой ли стек? - " + stack.empty());

        // Метод search возвращает позицию элемента,
        // отсчёт ведётся от вершины, начиная с 1 (позиция вершины - 1)
        int position = stack.search("World");
        System.out.println("Позиция элемента World - " + position);

        // Если элемент не найден, метод вернёт значение -1
        position = stack.search("Apple");
        System.out.println("Позиция элемента Apple - " + position);
    }
}
