package lesson15.task2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class FileInputStreamTest {

    public static void main(String[] args) {

        // 1 способ
//        InputStream in = new FileInputStream("test.txt");

        File file = new File("test.txt");

        // 2 способ
        try (InputStream in = new FileInputStream(file)) {

//            System.out.println((char) in.read());

            System.out.println("Непрочитанных байт осталось - " + in.available());

            int data = in.read();

            while (data != -1) {
                System.out.print((char) data);
                if ((char) data == '!') {
                    in.skip(8);
                }
                data = in.read();
            }

            System.out.println();
            System.out.println("Непрочитанных байт осталось - " + in.available());
        } catch (Exception e) {
            System.out.println("Ошибка!");
        }
    }
}