package lesson17.task4;

import lesson15.task4.Cat;

public class Main {

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        Box<Cat> catBox = new Box<>();
        Box<Integer> integerBox = new Box<>();

        catBox.putItem(new Cat(2, "Gray", 4));
//        catBox.putItem("Hello");

        stringBox.putItem("Hello");

        Cat cat = catBox.getItem();
        System.out.println(cat.getColor());
    }
}