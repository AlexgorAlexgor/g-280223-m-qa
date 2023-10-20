package lesson18.task3;

import java.io.FileReader;

public class CheckedExceptionTest {

    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("testFile1.txt");

            System.out.println((char) reader.read());

            reader.close();
        } catch (Exception e) {
            System.out.println("Ошибка работы с файлом!");
        }

        try {
            int x = 15;
            int y = 0;
            int result = x / y;

            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Ошибка деления на ноль!");
        }
    }
}