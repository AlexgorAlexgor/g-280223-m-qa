package lesson16.task8;

import java.util.regex.Pattern;

public class EmailCheck {

    public static void main(String[] args) {

        // test@example.com - OK
        // test@@example.com - X

        // Набор правил, которым должен соответствовать е-мейл:
        // 1. Должен быть один и только один знак @
        // 2. До собачки должна быть минимум одна буква или цифра
        //    любого регистра (остальные символы не допускаются)
        // 3. После собачки должен быть набор букв (минимум 1)
        // 4. После данного набора букв должна быть точка
        // 5. После точки должен быть набор букв от 2 до 4

        checkEmail("test@example.com");
        checkEmail("testexample.com");
        checkEmail("test@@example.com");
        checkEmail("test@exam@ple.com");
        checkEmail("@example.com");
        checkEmail("%@example.com");
        checkEmail("teSt@example.com");
        checkEmail("test@examplecom");
        checkEmail("test@exam%ple.com");
        checkEmail("test@.com");
        checkEmail("test@example.c");
        checkEmail("test@example.commm");
        checkEmail("test@example.c*m");
    }

    public static void checkEmail(String email) {
        String regex = "[a-z0-9]+@\\w+[.]\\w{2,4}";
        Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        System.out.println(email + " " + pattern.matcher(email).matches());
    }
}