package lesson17.task3;

import lesson15.task4.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List list = new ArrayList();

        list.add("Hello!");
        list.add(new Cat(3, "Black", 4));
        list.add(42);
        list.add(true);

        System.out.println(((Cat) list.get(1)).getColor());
        System.out.println(((Cat) list.get(2)).getColor());
    }
}