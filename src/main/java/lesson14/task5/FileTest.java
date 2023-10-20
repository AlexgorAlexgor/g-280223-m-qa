package lesson14.task5;

import java.io.File;
import java.io.IOException;

public class FileTest {

    public static void main(String[] args) throws IOException {

        File file = new File("testFile.txt");
        System.out.println("Существует ли файл? - " + file.exists());
        file.createNewFile();
        System.out.println("Существует ли файл? - " + file.exists());

        File file1 = new File("testDir");
        file1.mkdir();

        System.out.println("Является ли file на самом деле файлом? - " + file.isFile());
        System.out.println("Является ли file1 на самом деле файлом? - " + file1.isFile());
        System.out.println("Является ли file1 папкой? - " + file1.isDirectory());

        File someDir = new File("first/second/third/fourth");
        boolean result = someDir.mkdir();
        System.out.println("Были ли созданы папки? - " + result);

        result = someDir.mkdirs();
        System.out.println("Были ли созданы папки? - " + result);
    }
}
