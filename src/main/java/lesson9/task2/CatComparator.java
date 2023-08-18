package lesson9.task2;

import lesson9.task1.Cat;

import java.util.Comparator;

public class CatComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        // 1. Сортируем котов по весу (по убыванию)
        // 2. Если вес совпал, сортируем по цвету (по убыванию)
        // 3. Если цвет совпал тоже, сортируем по возрасту (по возрастанию)

        int difference = Double.compare(cat2.getWeight(), cat1.getWeight());
        if (difference != 0) {
            return difference;
        }

        difference = cat2.getColor().compareTo(cat1.getColor());
        if (difference != 0) {
            return difference;
        }

        return cat1.getAge() - cat2.getAge();
    }
}
