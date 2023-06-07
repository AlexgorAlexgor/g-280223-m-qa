package lesson3.task2;

import java.util.Arrays;

public class ColorTest {

    public static void main(String[] args) {

        // Получение всех цветов из перечисления
        Color[] colors = Color.values();
        Color[] colors1 = Color.values();

        System.out.println(Arrays.toString(colors));

        // В цикле перебираем массив полученных цветов и выводим в консоль
        for (Color color : colors) {
            System.out.println(color);
        }

        System.out.println("В цикле вывести только синий цвет");

        for (Color currentColor : colors) {
            if (currentColor.equals(Color.BLUE)) {
                System.out.println(currentColor);
            } else {
                System.out.println("Это другой цвет");
            }
        }

        Color color = Color.BLUE;
        // Выводим порядковый номер цвета
        // (в том порядке, в котором он определён в самом перечислении)
        System.out.println(color.ordinal());

        // valueOf - возвращает константу перечисления указанного строкового типа
        Color color1 = Color.valueOf("GREEN");
        System.out.println();

        String colorName = "GREEN";

        // Если бы не было метода valueOf:
        if (colorName.equals("GREEN")) {
            color1 = Color.GREEN;
        } else if (colorName.equals("BLUE")) {
            color1 = Color.BLUE;
        } else {
            color1 = Color.RED;
        }
    }
}