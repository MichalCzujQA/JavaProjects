package lesson_30.enums;

public enum Day {


    MONDAY("Monday", 1),

    THUESDAY("THUESDAY", 2),

    WENDEDSDAY("WENDEDSDAY", 3),

    THURSDAY("THURSDAY", 4),

    FRIDAY("FRIDAY", 5),

    SATURDAY("SATURDAY", 6),

    SUNDAY("SUNDAY", 7);

    private String russian;
    private int dayOfWeek;

    Day(String russian, int dayOfWeek) {
        this.russian = russian;
        this.dayOfWeek = dayOfWeek;
    }

    public String getRussian() {
        return russian;
    }

    public void setRussian(String russian) {
        this.russian = russian;
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }
}
