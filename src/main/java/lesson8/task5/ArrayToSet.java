package lesson8.task5;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayToSet {

    public static Set<Integer> getSetFromArray1(Integer[] arr) {
        Set<Integer> set = new HashSet<>();
        for (Integer element : arr) {
            set.add(element);
        }

        return set;
    }

    public static Set<Integer> getSetFromArray2(Integer[] arr) {
        List<Integer> list = Arrays.asList(arr);
        Set<Integer> set = new HashSet<>(list);
        return set;
    }

    public static Set<Integer> getSetFromArray3(Integer[] arr) {
        Set<Integer> set = new HashSet<>();
        Collections.addAll(set, arr);
        return set;
    }

    public static Set<Integer> getSetFromArray4(Integer[] arr) {
        Set<Integer> set = Set.of(arr);
        return set;
    }

    public static Set<Integer> getSetFromArray5(Integer[] arr) {
        return Arrays.stream(arr).collect(Collectors.toSet());
    }
}
