package lesson12.task4;

import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> 7;
        print(supplier);
        System.out.println();

        Supplier<Integer> randomSupplier = () -> (int) (Math.random() * 20);
        print(randomSupplier);
    }

    public static void print(Supplier<Integer> supplier) {
        for (int i = 0; i < 10; i++) {
            System.out.print(supplier.get() + " ");
        }
    }
}
