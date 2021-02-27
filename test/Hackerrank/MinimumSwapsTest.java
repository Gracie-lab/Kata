package Hackerrank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSwapsTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void testSwap(){
        int[] array = {4, 3, 1, 2};
//        assertEquals(3, MinimumSwaps.swap(array));
        System.out.println(MinimumSwaps.swap(array));
        for(int element : array){
            System.out.println(element);
        }
    }
}