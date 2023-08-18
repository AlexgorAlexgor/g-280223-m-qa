package lesson9.task1;

public class ComparingTest {

    public static void main(String[] args) {

        int a = 5;
        int b = 5;
        int c = 10;

        boolean result = a == b;
        System.out.println("Результат сравнения а и b: " + result);

        result = a == c;
        System.out.println("Результат сравнения а и с: " + result);

        result = a != c;
        System.out.println("А не равно С? - " + result);

        Cat cat1 = new Cat(3, "Black", 5.67);
        Cat cat2 = new Cat(3, "Black", 5.67);

        result = cat1 == cat2;
        System.out.println("Результат сравнения двух котов: " + result);

        Cat cat3 = cat1;

        result = cat1 == cat3;
        System.out.println("Результат cat1 == cat3: " + result);

        Object hello = "Hello";

        result = cat1.equals(cat2);
        System.out.println("Результат сравнения котов через equals: " + result);

//        Cat cat = (Cat) hello;

        Cat cat4 = new Cat(3, null, 5.67);
        Cat cat5 = new Cat(3, null, 5.67);

        result = cat4.equals(cat5);
        System.out.println("Результат cat4.equals(cat5): " + result);
    }
}
