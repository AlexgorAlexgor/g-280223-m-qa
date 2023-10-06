package lesson16.task5;

import java.util.regex.Pattern;

public class DelimiterTest {

    public static void main(String[] args) {

        String source = "Hello World! I study Java.";

//        String delimiter = " ";
        String delimiter = "\\s"; // Соответствует предыдущему варианту
        Pattern pattern = Pattern.compile(delimiter);

        String[] words = pattern.split(source);

        for (String word : words) {
            System.out.println(word);
        }
    }
}