package lesson17.task1;

import lesson15.task4.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> words = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();

        Object object1 = "Hello";
        Object object2 = 45;
        Object object3 = new Cat(3, "Black", 5.43);
    }
}
