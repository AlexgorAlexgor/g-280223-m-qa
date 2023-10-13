package lesson17.task4;

import java.util.ArrayList;
import java.util.List;

public class Box<T> {

    public List<T> items = new ArrayList<>();

    public void putItem(T item) {
        items.add(item);
    }

    public T getItem() {
        return items.remove(0);
    }
}