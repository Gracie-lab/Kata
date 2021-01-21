package codeExercises;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CeaserCipherTest {
    CeaserCipher ceaserCipher;

    @BeforeEach
    void setUp() {
        ceaserCipher = new CeaserCipher();
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void testThatICanEncryptAMessageUsingCeaserCipher(){
        System.out.println(ceaserCipher.encodeMessage("Learn by doing", 5));
    }
}