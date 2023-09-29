package lesson15.task1;

public class TryCatchTest {

    public static void main(String[] args) {

        System.out.println("main: Вызываем метод div");

        try {
            int result = div(10, 0);
            System.out.println("main: Получен результат - " + result);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.out.println("Возникла ошибка при выполнении метода div!");
        } finally {
            System.out.println("Отработал блок finally");
        }

        System.out.println("main: Конец работы программы");

    }

    public static int div(int x, int y) {
        System.out.println("div: Метод начал работу с параметрами - " + x + " и " + y);
        int result;
        result = x / y;
        System.out.println("div: Метод завершил работу с результатом - " + result);
        return result;
    }

    public static void test() {

        // Обычный блок try

        try {
            // Открываем файл на чтение
            // Читаем информацию из файла
        } catch (Exception e) {
            // Обрабатываем ошибку
        } finally {
            // Закрываем открытый файл
        }

        // Блок try с ресурсами

        try { // (Открываем файл на чтение)
            // Читаем информацию из файла
        } catch (Exception e) {
            // Обрабатываем ошибку
        }

        // В данном случае мы можем не писать блок finally,
        // потому что конструкция try с ресурсами итак
        // гарантированно закроет открытый внешний ресурс
    }
}