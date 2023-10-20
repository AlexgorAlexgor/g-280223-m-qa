package lesson16.task1;

import java.util.regex.Pattern;

public class PatternTest {

    public static void main(String[] args) {

        // http://www.example.com
        // www.example.com
        // example.com

        // Проверить, содержит ли строка сочетание www

        System.out.println(checkString("http://www.example.com"));
        System.out.println(checkString("www.example.com"));
        System.out.println(checkString("example.com"));
        System.out.println(checkString("http://ww.example.com"));
        System.out.println(checkString("http://www"));
        System.out.println(checkString("dwww"));
    }

    // Метод должен вернуть true, если строка source соответствует шаблону
    public static boolean checkString(String source) {
        System.out.println("Переданная строка - " + source);
//        String regex = ".*www.{2,12}";
//        String regex = ".+www.+";
        String regex = ".*www.*";
        // AAAA   ABCBCBA   A B C
//        String regex = ".*www[ABC]*";
        Pattern pattern = Pattern.compile(regex);
        return pattern.matcher(source).matches();
    }
}