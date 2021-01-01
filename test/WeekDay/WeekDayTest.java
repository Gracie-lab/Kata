package WeekDay;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.management.InvalidAttributeValueException;

import static org.junit.jupiter.api.Assertions.*;

class WeekDayTest {

    private Object IllegalArgumentException;

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatWhenIPutANumberIGetCorrespondingWeekDay() throws InvalidArgumentException {
        assertEquals("TUESDAY", WeekDay.showWeekDayThatCorrespondsToNumber(3));
    }

    @Test
    void testThatAnExceptionIsThrownWhenInputIsGreaterThanNumberOfDays(){
        assertThrows(InvalidArgumentException.class, ()->{WeekDay.checkInput(10);});

    }

    @Test
    void methodCannotTakeNumberGreaterThanDaysOfTheWeek() throws InvalidArgumentException {
//        assertEquals("Number should be between 1 and 7.", WeekDay.showWeekDayThatCorrespondsToNumber(10));
        assertThrows(InvalidArgumentException.class, ()-> WeekDay.showWeekDayThatCorrespondsToNumber(10));



    }
}