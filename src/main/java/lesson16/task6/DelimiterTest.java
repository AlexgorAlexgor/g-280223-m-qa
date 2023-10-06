package lesson16.task6;

import java.util.regex.Pattern;

public class DelimiterTest {

    public static void main(String[] args) {

        // Задача - привести строку к нормальному читаемому виду
        String source = "Hello3World!65I923study73Java.";

//        String delimiter = "[0-9]{1,3}";
        String delimiter = "\\d{1,3}"; // Соответствует предыдущему варианту
        Pattern pattern = Pattern.compile(delimiter);

        String[] words = pattern.split(source);

        System.out.println("Исходная строка:");
        System.out.println(source);
        System.out.println("Преобразованная строка:");

        for (String word : words) {
            System.out.print(word + " ");
        }
    }
}