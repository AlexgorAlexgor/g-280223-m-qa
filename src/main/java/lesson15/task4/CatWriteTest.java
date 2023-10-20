package lesson15.task4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class CatWriteTest {

    public static void main(String[] args) {

        File file = new File("cat.txt");

        try (OutputStream fileOut = new FileOutputStream(file);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {

            Cat cat = new Cat(3, "Black", 5.64);
            Cat cat1 = new Cat(5, "Gray", 7.12);

            file.createNewFile();

            out.writeObject(cat);
            out.writeObject(cat1);

        } catch (Exception e) {
            System.out.println("Ошибка!");
        }
    }
}