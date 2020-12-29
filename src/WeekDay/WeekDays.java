package WeekDay;

public enum WeekDays {
    SUNDAY(1), MONDAY(2), TUESDAY(3), WEDNESDAY(4), THURSDAY(5), FRIDAY(6), SATURDAY(7);

    private final int value;

    WeekDays(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}
