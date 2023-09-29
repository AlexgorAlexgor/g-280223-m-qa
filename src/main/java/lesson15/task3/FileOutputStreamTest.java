package lesson15.task3;

import java.io.*;

public class FileOutputStreamTest {

    public static void main(String[] args) {

        File file = new File("output.txt");

        try (InputStream in = new FileInputStream("test.txt");
             OutputStream out = new FileOutputStream(file, true)) {

            file.createNewFile();

            int data = in.read();

            while (data != -1) {
                out.write(data);
                if ((char) data == '!') {
                    in.skip(8);
                }
                data = in.read();
            }
        } catch (Exception e) {
            System.out.println("Ошибка!");
        }
    }
}