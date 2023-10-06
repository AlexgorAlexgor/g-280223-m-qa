package lesson16.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest {

    public static void main(String[] args) {

        String source = "Hello World! Hello World! World. orl ";
        // world - OK
        // worl - X
//        String regex = "[A-Za-z]orl[A-Za-z]";
        String regex = "\\worl\\w"; // Соответствует предыдущему
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(source);

        while (matcher.find()) {
            // Start - 10, end - 15.
            System.out.printf("Start - %d, end - %d.%n", matcher.start(), matcher.end());
        }
    }
}