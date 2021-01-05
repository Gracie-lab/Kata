package Calendar;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Logger;

import static org.junit.jupiter.api.Assertions.*;


class CalendarUtilsTest {
    Calendar calendar;

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void someTest(){
//        Calendar rightNow = Calendar.getInstance();
//        int weekYear = rightNow.getWeekYear();
//        System.out.println(Calendar.DATE);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.toString());
        System.out.println(localDate.getDayOfMonth());

//        Date date = new Date();
//        Instant currentDate = date.toInstant();
    }

    @Test
    void showCalendarMethodShouldShowCorrectCurrentDate(){
        assertEquals(2021, CalendarUtils.showCalendar().getWeekYear());
    }

    @Test
    void showCalendarWithTimeTest(){
        System.out.println(CalendarUtils.displayCalendarWithTime());
    }

    @Test
    void testThatICanCheckWhatDateIsFewDaysFromNow(){
        assertEquals("10 : 1 : 2021", CalendarUtils.whatDateIsFewDaysFromNow(5));
        System.out.println(CalendarUtils.whatDateIsFewDaysFromNow(30));
    }

    @Test
    void testThatProgramWillPrintCorrectDateIfFewDaysExceedMontEnd(){
        assertEquals("04 : 2 : 2021", CalendarUtils.whatDateIsFewDaysFromNow(30));
    }
}