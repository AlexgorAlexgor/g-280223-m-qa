package lesson7.task2;

import java.util.ListIterator;
import java.util.NoSuchElementException;

public class MyIterator implements ListIterator<String> {

    private Node current;

    public MyIterator(Node current) {
        this.current = current;
    }

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public String next() {
        if (current == null) {
            throw new NoSuchElementException();
        }
        String value = current.getValue();
        current = current.getNext();
        return value;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public String previous() {
        return null;
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return 0;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(String s) {

    }

    @Override
    public void add(String s) {

    }
}