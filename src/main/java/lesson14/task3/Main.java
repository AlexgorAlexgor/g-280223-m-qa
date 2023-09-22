package lesson14.task3;

public class Main {

    public static void main(String[] args) {
        System.out.println("Старт");
        System.out.println("Вызываем метод div");
        int result = div(10, 0);
        System.out.println("Получен результат - " + result);
        System.out.println("Конец");
    }

    public static int div(int x, int y) {
        System.out.println("Начало работы метода div");

        System.out.println("Начинаем проверку делителя");
        if (y == 0) {
            System.err.println("Ошибка! Делитель не может быть равен нулю.");
            return 0;
        }
        System.out.println("Проверка прошла успешно");

        int result = x / y;
        System.out.println("Результат вычислений внутри метода - " + result);
        return result;
    }
}
