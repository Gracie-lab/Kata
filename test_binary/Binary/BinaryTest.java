package Binary;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTest {
    Binary converter;
    @BeforeEach
    void setUp() {
        converter = new Binary();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void collectInteger(){
        converter.setNumber("101");
//        assertEquals(101, converter.getBinaryNumber());
    }

    @Test
    void convertBinaryToDecimal(){
//        converter.convertToDecimal("1011");
        assertEquals(11, converter.convertToDecimal("1011"));


        assertEquals(28,  converter.convertToDecimal("0011100"));
    }
}