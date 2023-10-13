package lesson17.task6;

import lesson15.task4.Cat;

public class Main {

    public static <T> void print(T item) {
        System.out.println(item);
    }

//    public static void print(String item) {
//        System.out.println(item);
//    }
//
//    public static void print(double item) {
//        System.out.println(item);
//    }
//
//    public static void print(Cat item) {
//        System.out.println(item);
//    }

    public static void main(String[] args) {

        print("Hello World!");
        print(34.76);
        print(new Cat(5, "Gray", 8.2));
    }
}