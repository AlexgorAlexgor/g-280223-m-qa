package lesson18.task2;

import java.util.Scanner;

public class ReadIntTest {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        int input = scanner.nextInt();
        String inputString = scanner.nextLine();
        int input = Integer.parseInt(inputString);

        System.out.println(input);
    }
}