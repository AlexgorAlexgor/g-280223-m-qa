package lesson18.task4;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        try {
            first();
        } catch (Exception e) {
            System.out.println("Ошибка была обработана в main");
        }
    }

    public static void first() throws FileNotFoundException {
        second();
    }

    public static void second() throws FileNotFoundException {
        third();
    }

    public static void third() throws FileNotFoundException {
        fourth();

//        try {
//            fourth();
//        } catch (Exception e) {
//            System.out.println("Ошибка обработана в третьем методе");
//        }
    }

    public static void fourth() throws FileNotFoundException {

        FileReader reader = new FileReader("testFile1.txt");

//        try {
//            FileReader reader = new FileReader("testFile1.txt");
//        } catch (Exception e) {
//            System.out.println("Ошибка была обработана в четвёртом методе");
//        }
    }
}