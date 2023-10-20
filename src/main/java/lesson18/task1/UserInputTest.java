package lesson18.task1;

import java.util.Scanner;

public class UserInputTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя:");
        String name = scanner.nextLine();

        System.out.println("Введите возраст:");

        int age;

        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            // Здесь мы обрабатываем ошибку
            // Если ошибки в блоке try не будет, то мы сюда не зайдём вообще
            System.out.println("Ошибка! Введены некорректные данные.");
            System.out.println("Значение возраста принимается по умолчанию -1");
            age = -1;
        }

        System.out.printf("Имя - %s, возраст - %d.", name, age);
    }
}