package lesson17.task5;

import lesson15.task4.Cat;

public class Main {

    public static void main(String[] args) {

        Pair<Cat, Integer> pair = new Pair<>(new Cat(3, "Black", 5), 7);

        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        Pair<Double, Double> pair1 = new Pair<>(34.12, 72.1);

        System.out.println(pair1.getFirst());
        System.out.println(pair1.getSecond());

        System.out.println(pair);
        System.out.println(pair1);
    }
}