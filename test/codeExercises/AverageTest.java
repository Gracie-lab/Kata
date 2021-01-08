package codeExercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageTest {
    Average average;

    @BeforeEach
    void setUp() {
        average = new Average();
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
}