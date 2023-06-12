package lesson4.task3;

public class Main {

    public static void main(String[] args) {

        Integer[] integers = new Integer[3];

        // Автоупаковка. Значения типа int присваиваем в Integer
        integers[0] = 3;
        integers[1] = 5;
        integers[2] = 7;

        // Автораспаковка. Значения типа Integer присваиваем в int
        int sum = getSum(integers);
        System.out.println("Сумма значений массива - " + sum);
    }

    public static Integer getSum(Integer[] numbers) {
        // Метод суммирует все значения из массива и возвращает сумму.
        int sum = 0;
        for (Integer currentNumber : numbers) {
            // Автораспаковка. currentNumber приводится к int
            sum = sum + currentNumber;
        }
        // Автоупаковка. sum приводится к Integer
        return sum;
    }
}
