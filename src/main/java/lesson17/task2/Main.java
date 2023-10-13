package lesson17.task2;

import lesson15.task4.Cat;

public class Main {

    public static void main(String[] args) {

        Box box = new Box();

        box.putItem("Hello!");
        box.putItem(new Cat(5, "Gray", 7));
        box.putItem(123);

        String item = (String) box.getItem();
        System.out.println("Длина строки, полученной из коробки - " + item.length());

        item = (String) box.getItem();
        System.out.println("Длина строки, полученной из коробки - " + item.length());
    }

    public static void testBox(Box box) {
        Object item = box.getItem();
//        System.out.println("Длина строки, полученной из коробки - " + item.length());
    }
}