package lesson10.task3;

public class Main {

    public static void main(String[] args) {

        MyDeque deque = new MyArrayDeque();
        deque.addToTail("Hello");
        deque.addToTail("World");
        deque.addToTail("!");
        System.out.println(deque);
        int size = deque.size();
        System.out.println(size);
        boolean isempty = deque.isEmpty();
        System.out.println(isempty);


        String el = deque.removeTail();
        System.out.println("Удаляемый элемент - " + el);
        System.out.println(deque);


        String el1 = deque.peekTail();
        System.out.println("Последний элемент - " + el1);
        System.out.println(deque);
    }
}