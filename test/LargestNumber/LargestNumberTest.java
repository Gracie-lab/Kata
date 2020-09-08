package LargestNumber;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class LargestNumberTest {
    LargestNumber finder;

    @BeforeEach
    void setUp() {
        finder = new LargestNumber();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void findLargestNumberTest(){
        finder.setNumber(30);
        finder.setNumber(45);
        finder.setNumber(75);
        finder.setNumber(45);
        finder.setNumber(90);
        finder.setNumber(120);
        finder.setNumber(150);
        finder.setNumber(100);



        finder.findLargestNumber();
    }
}