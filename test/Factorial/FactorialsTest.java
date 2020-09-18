package Factorial;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void calculateFactorialsOfOneToTwenty(){
        Factorials.calculateFactorialOfOneToTwenty();
    }

    @Test
    void calculateFactorialOfAnyNumber(){
        assertEquals(120, Factorials.calculateFactorial(5));
    }
}