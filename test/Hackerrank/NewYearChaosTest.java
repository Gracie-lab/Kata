package Hackerrank;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.channels.NonWritableChannelException;

import static org.junit.jupiter.api.Assertions.*;

class NewYearChaosTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getNumberOfCheats(){
        NewYearChaos newYearChaos = new NewYearChaos();
        int[] array = {1, 5, 2, 3, 4};

        newYearChaos.getNumberOfCheats(array);
    }
}