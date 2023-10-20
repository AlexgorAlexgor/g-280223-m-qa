package lesson18.task6;

public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5};
        int index = 7;

        int result = 0;
        try {
            result = ArrayUtils.getProcessedValue(numbers, index);
        } catch (IncorrectIndexException e) {
            System.out.println("Ошибка!");
            System.out.println("Сообщение об ошибке - " + e.getMessage());
            System.out.println("Причина ошибки - " + e.getCause().getMessage());
            e.printStackTrace();
        }
        System.out.println("Полученный результат - " + result);
    }
}