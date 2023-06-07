package lesson3.task3;

public class SeasonTest {

    public static void main(String[] args) {

        Season season = Season.SUMMER;
        System.out.println(season);

        // Вывод в консоль описания времени года
        System.out.println(season.getDescription());

        // Вывод в консоль количества солнечных дней
        System.out.println(season.getSunnyDays());

        Season season1 = Season.WINTER;

        // Вызов неабстрактного метода
        System.out.println("Вывод общего описания:");
        season.printCommonDescription();
        season1.printCommonDescription();

        // Вызов абстрактного метода
        System.out.println("Вывод месяцев времени года:");
        System.out.println(season.getMonths());
        System.out.println(season1.getMonths());
    }
}