package lesson17.task7;

public class Main {

    public static void main(String[] args) {

        Double d = 4.3;
        Long l = 123L;
        Float f = 12.6f;
        Byte b = 14;
        Short s = 65;
        Integer i = 100;
        String str = "Hello";

        NumberUtils<Double> utils1 = new NumberUtils<>(d);
        NumberUtils<Long> utils2 = new NumberUtils<>(l);
        NumberUtils<Float> utils3 = new NumberUtils<>(f);
        NumberUtils<Byte> utils4 = new NumberUtils<>(b);
        NumberUtils<Short> utils5 = new NumberUtils<>(s);
        NumberUtils<Integer> utils6 = new NumberUtils<>(i);
//        NumberUtils<String> utils7 = new NumberUtils<>(str);

        utils1.printIntegerValue();
        utils2.printIntegerValue();
        utils3.printIntegerValue();
        utils4.printIntegerValue();
        utils5.printIntegerValue();
        utils6.printIntegerValue();
//        utils7.printIntegerValue();

    }
}