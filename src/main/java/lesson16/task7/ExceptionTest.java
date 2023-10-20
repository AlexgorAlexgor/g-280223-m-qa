package lesson16.task7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class ExceptionTest {

    public static void main(String[] args) {

        String source = "Hello World! I study Java.";
        String regex = "\\w{3}![\\s";

        try {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(source);
            System.out.println(matcher.find());
        } catch (PatternSyntaxException e) {
            System.out.println("Описание ошибки:");
            System.out.println(e.getDescription());
            System.out.println("Индекс места, где допущена ошибка:");
            System.out.println(e.getIndex());
            System.out.println("Регулярное выражение, в котором допущена ошибка:");
            System.out.println(e.getPattern());
            System.out.println("Подробное сообщение об ошибке:");
            System.out.println(e.getMessage());
        }
    }
}