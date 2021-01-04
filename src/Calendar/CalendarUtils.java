package Calendar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class CalendarUtils {
    private static LocalDateTime dateTime = LocalDateTime.now();
   private static Calendar calendar = Calendar.getInstance();
   private static int hour;
   private static int minute;
   private static int year;
   private static Month month;
   private static int day;


    public static void setCalendarDate(){
        calendar.set(dateTime.getYear(), dateTime.getMonth().getValue(), dateTime.getDayOfMonth());
    }
    public static void setTime(){
        hour = dateTime.getHour();
        minute = dateTime.getMinute();
    }
    public static String setDate(){
        year =dateTime.getYear();
        month = dateTime.getMonth();
        day = dateTime.getDayOfMonth();

        return String.format("%d/%s/%d", year, month, day);
    }

    public static Calendar showCalendar(){
        setCalendarDate();
        return calendar;
    }

    public static String displayCalendarWithTime(){
        return String.format("Today's date is %s \r\n The time is %d : %d", setDate(), hour, minute);
//        return String.format("Today's date is %s. \r\n The time is $d : %d",showCalendar(), hour, minute);
    }
}
