package Hackerrank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayManipulationTest {
    ArrayManipulation arrayManipulation;

    @BeforeEach
    void setUp() {
        arrayManipulation = new ArrayManipulation();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testArrayManipulation(){
        int[] array = {0, 3, 1};
        System.out.println(Arrays.toString(arrayManipulation.manipulateArray(array)));

    }

}