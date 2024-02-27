package lesson_30.enums;

import java.util.Arrays;

public class DaysMain {
    public static void main(String[] args) {
        Person person = new Person("John", 31, Day.MONDAY);


        System.out.println(person);

        person.setDayWeekOfBirth(Day.SATURDAY);
        System.out.println(person);

        String dayStr = person.getDayWeekOfBirth().toString();
        System.out.println(dayStr);

        System.out.println("=========================");
        Day[] days = Day.values();

        for (Day day: Day.values()){
            System.out.println(day);
        }
        System.out.println("=========================");

        Day enumMonday = Day.valueOf("MONDAY");
        System.out.println(enumMonday);

        // Сравнение Enum  - для сравнения двух значений Enum
        // безопасно и допустимо использовать ==

        System.out.println(enumMonday == Day.THUESDAY);

        switch (person.getDayWeekOfBirth()){
            case FRIDAY:
                System.out.println("Friday");
                break;
            case MONDAY:
                System.out.println("Monday");
                break;

            case WENDEDSDAY:
                System.out.println("WENDEDSDAY");
                break;
            case SATURDAY:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Another day of week");
                break;
        }


        // порядковый номер int
        System.out.println(Day.SUNDAY.ordinal());
        System.out.println(enumMonday.ordinal());

        System.out.println(enumMonday.getRussian());
        enumMonday.setRussian("Пн");
        System.out.println(enumMonday.getRussian());

        System.out.println(enumMonday.getDayOfWeek());

    }
}
