package lesson16.task4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CompilerFlagTest {

    public static void main(String[] args) {

        String source = "Banana, Apple, Orange";
//        String regex = "[Aa]";
        String regex = "a";

        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(source);

        while (matcher.find()) {
            System.out.printf("Start - %d, end - %d.%n", matcher.start(), matcher.end());
        }
    }
}