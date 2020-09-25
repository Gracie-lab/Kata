package smallStore;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.Period;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void periodBetweenTest(){
        LocalDate dateOfBirth = LocalDate.of(1996, 02, 24);
        LocalDate currentDate = LocalDate.of(2020, 9, 19);
        Period year = Period.between(dateOfBirth, currentDate);
        assertEquals(24, year.getYears());
        assertFalse(year.isNegative());
    }
}