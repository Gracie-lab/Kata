package codeExercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class AverageTest {
    StreamsLambdas average;

    Random random = new Random();

    @BeforeEach
    void setUp() {
        average = new StreamsLambdas();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void tesThatICanFindAverageOfNumbersInAList(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(70);
        numbers.add(50);

        assertEquals(41.0, average.findAverage(numbers));
    }

    @Test
    @DisplayName("Test that code is efficient when i try to find average of long list of numbers")
    void testThatICanFindAverageOfALongListOfNumbers(){
        List<Integer> numbers = new ArrayList<>();
        for(int size = 0; size <=100; size++){
            numbers.add(random.nextInt(500));
        }

        System.out.println(average.findAverage(numbers));
    }
}