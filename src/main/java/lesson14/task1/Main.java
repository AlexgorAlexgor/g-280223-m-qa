package lesson14.task1;

import lesson13.task2.Cat;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        System.out.print("One! ");
        System.out.print("Two! ");
        System.out.print("Three!");

        System.out.println();

        System.out.println("One!");
        System.out.println("Two!");
        System.out.println("Three!");

        System.out.println();

        System.out.println("One!\nTwo!\nThree!");

        System.out.println();

        System.out.printf("One!%nTwo!%nThree!%n");

        System.out.println();

        // Вывести в консоль: Символ \n служит для переноса строки
        // Экранирование служебных символов
        System.out.println("Символ \\n служит для переноса строки");

        System.out.println();

        // Вставка в строку целочисленных значений
        System.out.printf("Сюда -> %d мы вставили наше значение", 7);

        System.out.println();

        int a = 12;
        int b = 56;

        // Результат операции 5 + 7 равен 12

        System.out.println("Результат операции " + a + " + " + b + " равен " + (a + b));
        System.out.printf("Результат операции %d + %d равен %d", a, b, a + b);

        System.out.println();

        // Вставка в строку ещё одной строки
        String name = "Bob";
        System.out.printf("Hello, %s!%n", name);

        System.out.println();

        String str = "Hi, guys!";
        System.out.printf("Another string - %.2S.%n", str);
        System.out.println("Another string - " + str.substring(0, 2).toUpperCase() + ".");

        System.out.printf("Another string - %s%S.%n", str.toLowerCase().charAt(0), str.charAt(1));

        // Вставка в строку дробных чисел
        double pi = Math.PI;
        System.out.printf("Value of PI equals - %f.%n", pi);
        System.out.printf("Rounded value of PI equals - %.3f.%n", pi);

        // Вставка boolean значений
        boolean bool = true;
        System.out.printf("Result - %b.%n", bool);
        System.out.printf("Result - %B.%n", bool);
        System.out.printf("Result - %b.%n", a > b);
        System.out.printf("Result - %b.%n", 7);
        System.out.printf("Result - %b.%n", "Hello");

        Cat cat = new Cat(4, "Black", 5.23);

        System.out.printf("Существует ли кот? - %b.%n", cat);

        cat = null;

        System.out.printf("Существует ли кот? - %b.%n", cat);

        System.out.println();

        // Вставка символов
        char ch = 'a';
        System.out.printf("Символ - %c.%n", ch);
        System.out.printf("Символ - %C.%n", ch);

        System.out.println();

        // Ещё возможность для дробных чисел:
        double d1 = 123.456;
        double d2 = 123456.56789123;
        System.out.printf("%50.3f%n", d1);
        System.out.printf("%50.8f%n", d2);

        System.out.println();

        // Работа с датами
        Date date = new Date();
        System.out.println(date);
        System.out.printf("Результат - %tT.%n", date);
        System.out.printf("Результат - %tA.%n", date);
        // Часы - 10, минуты - 57, секунды - 55.
        System.out.printf("Часы - %tH, минуты - %tM, секунды - %tS.%n", date, date, date);

        // Сегодня пятница, 22 сентября 2023 года, время - 11:01:53.
        System.out.printf("Сегодня %1$tA, %1$td %1$tB %1$tY года, время - %1$tT.", date);
    }
}