package Calendar;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class CalendarUtils {
    private static LocalDate date = LocalDate.now();
   private static Calendar calendar = Calendar.getInstance();

    public static void setCalendarDate(){
        calendar.set(date.getYear(), date.getMonth().getValue(), date.getDayOfMonth());

    }
    public static Calendar showCalendar(){
        setCalendarDate();
        return calendar;
    }
}
