package lesson18.task6;

public class ArrayUtils {

    public static int getProcessedValue(int[] array, int index) throws IncorrectIndexException {
        // 1 2 3 4 5, 2 -> 3 * 3 -> 9

        try {
            int value = array[index];
            int result = value * value;
            return result;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IncorrectIndexException("Вы передали неверный индекс", e);
        }
    }
}