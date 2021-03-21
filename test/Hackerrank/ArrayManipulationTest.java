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

    @Test
    void anotherTest(){
        int[][] array = {{1,2,100}, {2, 5, 100}, {3, 4, 100}};
        System.out.println(Arrays.deepToString(arrayManipulation.man(array)));
    }

}