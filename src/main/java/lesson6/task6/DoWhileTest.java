package lesson6.task6;

public class DoWhileTest {

    public static void main(String[] args) {

        // Отобразить числа в консоли от 1 до 5

        int i = 10;

        System.out.println("Решаем задачу при помощи while:");
        while (i <= 5) {
            System.out.println(i);
            i++;
        }
        System.out.println();
        System.out.println("Решаем задачу при помощи do-while");

        int j = 10;

        do {
            System.out.println(j);
            j++;
        } while (j <= 5);
    }
}
