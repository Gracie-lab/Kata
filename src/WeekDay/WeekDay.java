package WeekDay;

public class WeekDay {
    public String showWeekDayThatCorrespondsToNumber(int number){
        WeekDays weekDay;
        WeekDays[] weekdays = WeekDays.values();
        for(WeekDays value : weekdays){
            if (value.getValue() == number){
                WeekDays weekDay = value;
            }
        }

        return week;
    }
}
