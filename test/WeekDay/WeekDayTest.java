package WeekDay;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekDayTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatWhenIPutANumberIGetCorrespondingWeekDay(){
        assertEquals("TUESDAY", WeekDay.showWeekDayThatCorrespondsToNumber(3));
    }

    @Test
    void methodCannotTakeNumberGreaterThanDaysOfTheWeek(){
        assertEquals("Number should be between 1 and 7.", WeekDay.showWeekDayThatCorrespondsToNumber(10));
    }
}