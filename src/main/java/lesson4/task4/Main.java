package lesson4.task4;

public class Main {

    public static void main(String[] args) {

        Long integer = new Long(3_000_000_000L);

        // int не может содержать такое значение
//        Integer integer1 = new Integer(3_000_000_000L);

        Integer integer1 = new Integer(2_000_000_000);
        integer1 = integer1 * 2;

        // Неожиданный результат, т.к. результат вычисления уже не входит
        // в диапазон допустимых значений для Integer
        System.out.println(integer1);
    }
}
