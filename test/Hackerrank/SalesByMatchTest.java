package Hackerrank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalesByMatchTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getNumberOfPairsOfSocks(){
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        System.out.println(SalesByMatch.getNumberOfMatchingPairsInArray(9, ar));
    }
}