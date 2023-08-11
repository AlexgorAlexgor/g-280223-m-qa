package lesson8.task4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetOfListsTest {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        list1.add("AAA");
        list1.add("BBB");
        list1.add("CCC");

        list2.add("AAA");
        list2.add("BBB");
        list2.add("CCC");
        list2.add("DDD");

        // Создаём сет, который будет содержать листы стрингов
        Set<List<String>> setOfLists = new HashSet<>();

        setOfLists.add(list1);
        boolean result = setOfLists.add(list2);

        System.out.println("Произошло ли добавление второго листа в сет? - " + result);
        // В случае если листы одинаковы, то есть содержат одинаковые значения, то добавление
        // второго листа в сет не происходит, т.к. сет не хранит дубликаты объектов
        System.out.println(setOfLists);

        // Вывести в консоль все значения из всех листов, которые есть в сете
        for (List<String> list : setOfLists) {
            for (String element : list) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
