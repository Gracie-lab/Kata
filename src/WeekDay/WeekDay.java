package WeekDay;

public class WeekDay {

    public static String checkInput(int number){
        if (number > 7) {
            return String.format("Oops we do not have up to %d days a week on our planet", number);
        }
        return "";
    }
    public static String showWeekDayThatCorrespondsToNumber(int number){
        WeekDays weekDay = null;
        if (checkInput(number) == "") {
            WeekDays[] weekdays = WeekDays.values();
            for (WeekDays value : weekdays) {
                if (value.getValue() == number) {
                    weekDay = value;
                }
            }
        }

        return weekDay.name();
    }
}
