package lesson8.task5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {34, 56, 2, 9, 98, 83};
        System.out.println("Исходный массив - " + Arrays.toString(arr));
        System.out.println("Результат 1 - " + ArrayToSet.getSetFromArray1(arr));
        System.out.println("Результат 2 - " + ArrayToSet.getSetFromArray2(arr));
        System.out.println("Результат 3 - " + ArrayToSet.getSetFromArray3(arr));
        System.out.println("Результат 4 - " + ArrayToSet.getSetFromArray4(arr));
        System.out.println("Результат 5 - " + ArrayToSet.getSetFromArray5(arr));
    }
}
