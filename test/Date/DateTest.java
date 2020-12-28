package Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DateTest {
    Date date;

    @BeforeEach
    void setUp() {
        date = new Date(22, 10, 2020);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testDateIsCorrect(){

        assertEquals("22/10/2020", Date.displayDate());
    }

}