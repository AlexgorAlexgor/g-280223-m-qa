package lesson10.task3;

public class MyArrayDeque implements MyDeque {

    private String[] elements;
    private int headIndex;
    private int tailIndex;
    private int size;

    public MyArrayDeque() {
        elements = new String[20];
        headIndex = elements.length / 2;
        tailIndex = headIndex;
    }

    // 1 команда
    @Override
    public void addToHead(String element) {
        if (!isEmpty()) {
            headIndex--;
        }
        elements[headIndex] = element;
        size++;
    }

    // 2 команда
    @Override
    public void addToTail(String element) {
        if (isEmpty()) {
            elements[headIndex] = element;
        } else {
            tailIndex++;
            elements[tailIndex] = element;
        }
        size++;
    }

    // 1 команда
    @Override
    public String removeHead() {
        if (isEmpty()) {
            return null;
        } else if (size == 1) {
            String removeElement = elements[headIndex];
            headIndex = elements.length / 2;
            tailIndex = headIndex;
            size--;
            return removeElement;
        } else {
            String removeElement = elements[headIndex];
            headIndex++;
            size--;
            return removeElement;
        }
    }

    // 2 команда
    @Override
    public String removeTail() {
        if (isEmpty()) {
            return null;
        } else if (size == 1) {
            size--;
            return elements[tailIndex];
        } else {
            String elem = elements[tailIndex--];
            size--;
            return elem;
        }
    }

    // 1 команда
    @Override
    public String peekHead() {
        if (isEmpty()) {
            return null;
        }

        return elements[headIndex];
    }

    // 2 команда
    @Override
    public String peekTail() {
        if (isEmpty()) {
            return null;
        } else {
            return elements[tailIndex];
        }
    }

    // 1 команда // 2 команда
    @Override
    public int size() {
        return size;
    }

    // 1 команда // 2 команда
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    // 1 команда
    @Override
    public String getByIndex(int index) {
        return null;
    }

    // 2 команда
    @Override
    public boolean contains(String element) {
        return false;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder builder = new StringBuilder("[");
        for (int i = headIndex; i <= tailIndex; i++) {
            builder.append(elements[i]).append(", ");
        }
        builder.setLength(builder.length() - 2);
        builder.append("]");
        return builder.toString();
    }
}