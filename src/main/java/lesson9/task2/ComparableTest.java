package lesson9.task2;

import lesson9.task1.Cat;

import java.util.Set;
import java.util.TreeSet;

public class ComparableTest {

    public static void main(String[] args) {

        Set<Integer> numbers = new TreeSet<>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(9);
        numbers.add(3);
        numbers.add(7);

        System.out.println("TreeSet<Integer>: " + numbers);

        Set<String> words = new TreeSet<>();

        words.add("Watermelon");
        words.add("Orange");
        words.add("Apple");
        words.add("Lemon");
        words.add("Pear");

        System.out.println("TreeSet<String>: " + words);

        Set<Cat> cats = new TreeSet<>();

        cats.add(new Cat(5, "Black", 5.18));
        cats.add(new Cat(9, "Gray", 4.82));
        cats.add(new Cat(1, "Black", 9.32));
        cats.add(new Cat(4, "Red", 7.39));
        cats.add(new Cat(4, "Red", 3.82));
        cats.add(new Cat(4, "Red", 5.19));
        cats.add(new Cat(4, "Red", 4.77));
        cats.add(new Cat(3, "Green", 3.15));
        cats.add(new Cat(3, "Blue", 2.98));
        cats.add(new Cat(3, "Orange", 2.98));

//        System.out.println("TreeSet<Cat>: " + cats);
        System.out.println();

        for (Cat currentCat : cats) {
            System.out.println(currentCat);
        }

        System.out.println();
        System.out.println("Сортировка котов по другому принципу:");
        Set<Cat> cats1 = new TreeSet<>(new CatComparator());

        cats1.add(new Cat(5, "Black", 5.18));
        cats1.add(new Cat(9, "Gray", 4.82));
        cats1.add(new Cat(1, "Black", 9.32));
        cats1.add(new Cat(4, "Red", 7.39));
        cats1.add(new Cat(4, "Red", 3.82));
        cats1.add(new Cat(4, "Red", 5.19));
        cats1.add(new Cat(4, "Red", 4.77));
        cats1.add(new Cat(3, "Green", 3.15));
        cats1.add(new Cat(3, "Blue", 2.98));
        cats1.add(new Cat(3, "Black", 2.98));
        cats1.add(new Cat(3, "Orange", 2.98));
        cats1.add(new Cat(3, "Green", 2.98));
        cats1.add(new Cat(9, "Green", 2.98));
        cats1.add(new Cat(1, "Green", 2.98));

        for (Cat currentCat : cats1) {
            System.out.println(currentCat);
        }
    }
}
