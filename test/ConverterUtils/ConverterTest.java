package ConverterUtils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testThatICanConvertInchesToMetres(){
       assertEquals(25.4, Converter.convertInchToMeter(1000));
    }

    @Test
    void testThatICanConvertMinutesToYearsAndDays(){
        assertEquals(6, Converter.convertMinutesToYearsAndDays(3456789));
    }

    @Test
    void testThaICanConvertMinutesToDays(){
        assertEquals(2400, Converter.convertMinutesToDays(3456789));
    }
}