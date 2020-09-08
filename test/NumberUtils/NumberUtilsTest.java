package NumberUtils;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.sql.Time;
import java.time.Clock;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {
    NumberUtils numberUtils;
    LocalTime time;

    @BeforeEach
    void setUp() {
        numberUtils = new NumberUtils();
        time = LocalTime.now();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void HourAndSecondIsValidTest(){
        NumberUtils time = new NumberUtils(12, 45);
        assertEquals(12, time.getHour());
        assertEquals(45, time.getMinute());
    }

    @Test
    void convertHourToWordsTest(){
        NumberUtils time = new NumberUtils(6, 10);
        assertEquals("six", time.convertHourToWords());
    }

    @Test
    void zeroHourTimeTest(){
        NumberUtils time = new NumberUtils(0, 10);
        assertEquals("twelve", time.convertHourToWords());
    }

    @Test
    void convertMinuteToWordsTest(){
        NumberUtils time = new NumberUtils(10, 40);
        assertEquals("forty", time.convertMinuteToWords());

        NumberUtils time1 = new NumberUtils(10, 35);
        assertEquals("thirty five", time1.convertMinuteToWords());

        NumberUtils time2 = new NumberUtils(10, 6);
        assertEquals("six", time2.convertMinuteToWords());
    }

    @Test
    void printTimeInWord(){
        NumberUtils time = new NumberUtils(10, 45);
        assertEquals("ten", time.convertHourToWords());
        assertEquals("forty five", time.convertMinuteToWords());
        time.printTimeInWord();

        NumberUtils time1 = new NumberUtils(00, 00);
        assertEquals("twelve", time1.convertHourToWords());
         assertEquals("zero", time1.convertMinuteToWords());
        time1.printTimeInWord();

        NumberUtils time2 = new NumberUtils(01, 00);
        assertEquals("one", time1.convertHourToWords());
         assertEquals("zero", time1.convertMinuteToWords());
        time2.printTimeInWord();

        NumberUtils time3 = new NumberUtils(05, 30);
        assertEquals("five", time3.convertHourToWords());
        assertEquals("thirty", time3.convertMinuteToWords());
        time3.printTimeInWord();
    }

    @Test
    void getCurrentHourTest(){
        System.out.println(NumberUtils.getCurrentHour());
        int hour = time.getHour();
        assertEquals("sixteen", NumberUtils.getCurrentHour());
    }

    @Test
    void getCurrentMinuteTest(){
        System.out.println(NumberUtils.getCurrentMinute());
//        String minute = time.getMinute();
        assertEquals("seventeen", NumberUtils.getCurrentMinute());
    }

    @Test
    void whatIsTheTimeTest(){
        NumberUtils.whatIsTheTime();
    }

    @Test
    void printTensNumberWords(){
        System.out.println(NumberUtils.tensInWord(14));;
        assertEquals("fourteen", NumberUtils.tensInWord(14));
    }

    @Test
    void printTwentiesWords(){
        assertEquals("twenty three", NumberUtils.tensInWord(23));

        assertEquals("thirty four", NumberUtils.tensInWord(34));

        assertEquals("ninety nine", NumberUtils.tensInWord(99));
    }

    @Test
    void printHundreds(){
        System.out.println(NumberUtils.tensInWord(105));
        assertEquals("two hundred and twenty five", NumberUtils.convertHundreds(225));
        assertEquals("two hundred and thirty nine", NumberUtils.convertHundreds(239));

        System.out.println(((1555%1000)%100)%10);
    }

    @Test
    void printThousands(){

        assertEquals("one thousand,five hundred and fifty five", NumberUtils.convertThousandsToWords(1555));
        assertEquals("five thousand, and fifty five", NumberUtils.convertThousandsToWords(5055));
        assertEquals("five thousand", NumberUtils.convertThousandsToWords(5000));
    }

    @Test
    void printMillion(){
        assertEquals("one million,two hundred and fiftythree thousand and twenty seven", NumberUtils.convertMillionToWords(125327));
        assertEquals("one million, and fiftythree thousand and twenty seven", NumberUtils.convertMillionToWords(105327));
        assertEquals("one million", NumberUtils.convertMillionToWords(100000));
    }

    @Test
    void printUnit(){
        assertEquals("five", NumberUtils.unitInWords(5));
    }

    @Test
    void numberInWordsTest(){
        assertEquals("five", NumberUtils.printNumberInWords(5));

        assertEquals("fourteen", NumberUtils.printNumberInWords(14));
        assertEquals("twenty three", NumberUtils.printNumberInWords(23));
        assertEquals("thirty four", NumberUtils.printNumberInWords(34));
        assertEquals("ninety nine", NumberUtils.printNumberInWords(99));

        assertEquals("two hundred and twenty five", NumberUtils.printNumberInWords(225));
        assertEquals("two hundred and thirty nine", NumberUtils.printNumberInWords(239));

        assertEquals("one thousand,five hundred and fifty five", NumberUtils.printNumberInWords(1555));
        assertEquals("five thousand, and fifty five", NumberUtils.printNumberInWords(5055));
        assertEquals("five thousand", NumberUtils.printNumberInWords(5000));
        
    }


}


