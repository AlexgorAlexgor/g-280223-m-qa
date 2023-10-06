package lesson16.task2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherTest {

    public static void main(String[] args) {

        String source = "http://www.example.com";
        String regex = ".www.";

        // * - 0 или более
        // + - 1 или более
        // ? - 0 или 1

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(source);

        System.out.println("Проверка строки на соответствие шаблону - " + matcher.matches());

        System.out.println("Результат поиска подстроки, соответствующей шаблону - " +
                matcher.find());

        System.out.println("Start - " + matcher.start());
        System.out.println("End - " + matcher.end());
    }
}