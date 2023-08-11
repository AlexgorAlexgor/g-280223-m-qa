package lesson8.task3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetTest {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        // Добавим элементы в сет
        set.add("AAA");
        set.add("BBB");
        set.add("CCC");
        set.add("DDD");
        set.add("EEE");
        set.add("FFF");
        set.add("GGG");
        set.add("CCC");

        // Особенности HashSet
        // 1. Хэш-сет как и другие виды сетов не сохраняет дубликаты
        // 2. Элементы расположены в произвольном порядке (порядок добавления не гарантируется)
        System.out.println("Хэш-сет - " + set);

        Set<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add("GGG");
        linkedHashSet.add("FFF");
        linkedHashSet.add("EEE");
        linkedHashSet.add("DDD");
        linkedHashSet.add("CCC");
        linkedHashSet.add("BBB");
        linkedHashSet.add("AAA");
        linkedHashSet.add("DDD");

        // LinkedHashSet в отличие от HashSet сохраняет элементы в порядке их добавления
        System.out.println("LinkedHashSet - " + linkedHashSet);
    }
}
