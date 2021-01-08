package Calendar;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

//Playing around with the calendar class here. Enjoy.

public class CalendarUtils {
    private static LocalDateTime dateTime = LocalDateTime.now();
   private static Calendar calendar = Calendar.getInstance();
   private static int hour = LocalDateTime.now().getHour();
   private static int minute = LocalDateTime.now().getMinute();
   private static int year = LocalDateTime.now().getYear();
   private static Month month = LocalDateTime.now().getMonth();
   private static int day = LocalDateTime.now().getDayOfMonth();


    public static void setCalendarDate(){
        calendar.set(dateTime.getYear(), dateTime.getMonth().getValue(), dateTime.getDayOfMonth());
    }
    public static void setTime(){
        hour = dateTime.getHour();
        minute = dateTime.getMinute();
    }
    public static String showDate(){
//        year =dateTime.getYear();
//        month = dateTime.getMonth();
//        day = dateTime.getDayOfMonth();

        return String.format("%d/%s/%d", year, month, day);
    }

    public static Calendar showCalendar(){
        setCalendarDate();
        return calendar;
    }

    public static String displayCalendarWithTime(){

        return String.format("Today's date is %s \r\n The time is %d : %d", showDate(), hour, minute);

    }

    public static String whatDateIsFewDaysFromNow(int numberOfDaysFromNow){
        int newDate = day + numberOfDaysFromNow;
        Month newMonth = month;
        if (newDate > month.maxLength()){
            newDate =  newDate % month.maxLength();
            newMonth = month.plus(1);
        }
        String response = String.format("%02d : %d : %d", newDate, newMonth.getValue(), year) ;
        return response;
    }
}
