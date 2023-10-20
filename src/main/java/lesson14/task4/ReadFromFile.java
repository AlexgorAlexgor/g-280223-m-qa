package lesson14.task4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadFromFile {

    public static void main(String[] args) throws IOException {

        InputStream in = new FileInputStream("test.txt");

        int data = in.read();
        System.out.println("Прочитанные данные - " + (char) data);

        while (data != -1) {
            System.out.print((char) data);
            data = in.read();

            if (data == -1) {
                System.out.println();
                System.out.println("Файл закончился");
            }
        }
    }
}