package rotateLeft;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateTest {
    Rotate rotate;
    @BeforeEach
    void setUp() {
        rotate = new Rotate();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void rotateArrayLeft(){
        int[] array = {1,2,3,4,5};
        int numberOfRotation = 4;
//        rotate.rotateLeft(array, numberOfRotation);
        assertEquals(5, rotate.rotateLeft(array, numberOfRotation)[0]);
        assertEquals(4, rotate.rotateLeft(array, numberOfRotation)[4]);

        for(int value : rotate.rotateLeft(array, numberOfRotation)){
            System.out.println(value);
        }

    }
}