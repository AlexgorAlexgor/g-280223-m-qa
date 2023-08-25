package lesson10.task3;

public interface MyDeque {

    void addToHead(String element);

    void addToTail(String element);

    String removeHead();

    String removeTail();

    String peekHead();

    String peekTail();

    int size();

    boolean isEmpty();

    String getByIndex(int index);

    boolean contains(String element);
}
