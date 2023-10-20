package lesson17.task5;

public class Pair<T, E> {

    private T first;
    private E second;

    public Pair(T first, E second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public E getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("Объект пары: первое значение - %s, второе значение - %s", first, second);
    }
}