package Hackerrank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class HourGlassTest {

    HourGlass hourGlass;
    @BeforeEach
    void setUp() {
        hourGlass = new HourGlass();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testGetSumOfHourglass(){
        System.out.println(hourGlass.getHighestSumOfHourglass());

    }
}