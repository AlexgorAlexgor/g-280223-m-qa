package lesson3.task1;

public class DayTest {

    public static void main(String[] args) {

        Day day = Day.THURSDAY;
        System.out.println("Текущий день: " + day);

        switch (day) {
            case MONDAY:
                System.out.println("Это понедельник");
                break;
            case TUESDAY:
                System.out.println("Это вторник");
                break;
            case WEDNESDAY:
                System.out.println("Это среда");
                break;
            case THURSDAY:
                System.out.println("Это четверг");
                break;
            case FRIDAY:
                System.out.println("Это пятница");
                break;
            case SATURDAY:
                System.out.println("Это суббота");
                break;
            case SUNDAY:
                System.out.println("Это воскресенье");
                break;
        }
    }
}
