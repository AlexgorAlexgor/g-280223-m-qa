package lesson4.task2;

import lesson4.task1.Cat;

import java.util.ArrayList;
import java.util.List;

public class AutoboxingTest {

    public static void main(String[] args) {

        /*
        Классы-оболочки для примитивных типов
        int -> Integer
        byte -> Byte
        short -> Short
        long -> Long

        float -> Float
        double -> Double

        char -> Character

        boolean -> Boolean
         */

        int primitiveInt = 5;
        Integer referenceInt = 5;

//        List<Integer> list = new ArrayList();

        Integer i1 = 7;
        Integer i2 = 5;
        Integer result = i1 + i2;
        System.out.println(result);

        Cat cat = new Cat(8);



        // Автоупаковка.
        // 1. Создаётся объект класса Integer.
        // 2. Этому объекту присваивается значение 9.
        // 3. Ссылка на этот объект присваивается переменной i4;
        Integer i4 = 9;

        // Так мы должны были делать до появления автоупаковки.
        Integer i3 = new Integer(8);

        // Автораспаковка.
        // 1. Значение из объекта i4 приводится к примитивному типу int.
        // 2. Полученное значение присваивается переменной i5;
        int i5 = i4;

        // Так мы должны были делать до появления автораспаковки.
        int i6 = i4.intValue();
    }
}
