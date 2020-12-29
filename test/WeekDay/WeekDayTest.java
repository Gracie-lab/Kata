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
        assertEquals("Oops we do not have up to %d days a week on our planet", WeekDay.showWeekDayThatCorrespondsToNumber(10));
    }
}