package lesson7.task2;

import java.util.Iterator;

public class MyLinkedList implements Iterable<String> {

    private int size;
    private Node first;
    private Node last;

    public void addToHead(String value) {
        Node node = new Node(value);
        node.setNext(first);
        first = node;
        size++;
    }

    public void addToTail(String value) {
        Node current = first;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        Node newNode = new Node(value);
        current.setNext(newNode);
        size++;
    }

    @Override
    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        Node current = first;
        while (current != null) {
            builder.append(current.getValue()).append(", ");
            current = current.getNext();
        }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        // Если лист пустой, то вернуть [B, C, A]
        // Если лист не пустой, то вернуть строку вида [AAA, BBB, CCC]
        return builder.toString();
    }

    @Override
    public Iterator<String> iterator() {
        return new MyIterator(first);
    }
}
