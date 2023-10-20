package lesson18.task5;

import java.util.Scanner;

public class UserRegistration {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Для регистрации введите возраст:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Введённый возраст - " + age);

        try {
            registration(age);
        } catch (IllegalArgumentException | TooSmallAgeException e) {
            System.out.println("Вы ввели некорректный возраст");
            System.out.println("Сообщение об ошибке - " + e.getMessage());
            e.printStackTrace();
        } catch (TooBigAgeException e) {
            System.out.println("Обрабатываем исключение как-то по-другому.");
        }
    }

    public static void registration(int userAge) throws TooBigAgeException {

        if (userAge < 12) {
            throw new TooSmallAgeException("Возраст слишком мал.");
        }

        if (userAge > 150) {
            throw new TooBigAgeException("Возраст слишком велик.");
        }

        System.out.println("Регистрация прошла успешно!");
    }
}