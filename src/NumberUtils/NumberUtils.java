package NumberUtils;

import java.time.LocalTime;

public class NumberUtils {
    private static int hour;
    private static int minute;
    private static String minuteWord = null;
    private static String wordHour = null;
    static LocalTime time = LocalTime.now();

    private static String[] thousandth = {"hundred", "thousand", "million", "billion"};
    private static String[] hourInWord = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three"};
    private static String[] units = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static String[] tens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static String[] tens2 = {"", " ", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

    public NumberUtils() {

    }

    public NumberUtils(int hour, int minute) {
        if (hour >= 0 && hour <= 12) {
            this.hour = hour;
        }
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String convertHourToWords() {
        for (int i = 0; i < hourInWord.length; i++) {
            if (hour == i) {
                wordHour = hourInWord[i];
            }
        }
        if (hour == 0) {
            wordHour = hourInWord[12];
        }
        return wordHour;
    }

    public static String convertMinuteToWords() {
        int firstDigit = minute / 10;
        int index = minute % 10;
        String firstWord = null;
        String secondWord = null;

        if (minute / 10 == 1) {
            minuteWord = tens[index];
        } else if (minute / 10 >= 2 && minute / 10 <= 5) {
            firstWord = tens2[firstDigit];
            secondWord = units[index];
            minuteWord = firstWord + secondWord;
        } else if (minute < 10) {
            minuteWord = units[minute];
        }
//        System.out.println(minuteWord);

        return minuteWord;
    }

    public static void printTimeInWord() {
        System.out.printf("%02d : %02d%n", hour, minute);
        if (convertMinuteToWords() == "") {
            System.out.printf("It's %s o'clock! %n", wordHour);
        } else {
            System.out.printf("%nIt's %s %s! %n", wordHour, minuteWord);
        }
    }

    public static String getCurrentHour() {
        for (int i = 0; i < hourInWord.length; i++) {
            if (time.getHour() == i) {
                wordHour = hourInWord[i];
            }
        }
        if (time.getHour() == 0) {
            wordHour = hourInWord[12];
        }
        return wordHour;
    }

    public static String getCurrentMinute() {
        int firstDigit = time.getMinute() / 10;
        int index = time.getMinute() % 10;
        String firstWord = null;
        String secondWord = null;
        for (int i = 0; i < tens.length; i++) {
            if (time.getMinute() / 10 == 1) {
                minuteWord = tens[index];
            } else if (time.getMinute() / 10 >= 2 && time.getMinute() / 10 <= 5) {
                firstWord = tens2[firstDigit];
                secondWord = units[index];
                minuteWord = firstWord + secondWord;
            } else if (time.getMinute() < 20) {
                minuteWord = units[time.getMinute()];
            }
        }
        return minuteWord;
    }

    public static void whatIsTheTime() {
        if (time.getHour() >= 12 && time.getHour() <= 15) {
            System.out.println("GOOD AFTERNOON.");
            System.out.printf("%nIT'S %s %s P.M! %n", getCurrentHour().toUpperCase(), getCurrentMinute().toUpperCase());
            if (getCurrentMinute() == "zero") {
                System.out.println("GOOD AFTERNOON.");
                System.out.printf("IT'S %s O'CLOCK! %n", wordHour);
            }
            System.out.printf("%02d:%02d P.M%n", time.getHour(), time.getMinute());
        } else if (time.getHour() >= 16 && time.getHour() <= 23) {
            System.out.println("GOOD EVENING.");
            System.out.printf("%nIT'S %s %s P.M! %n", getCurrentHour().toUpperCase(), getCurrentMinute().toUpperCase());
            if (getCurrentMinute() == "zero") {
                System.out.println("GOOD EVENING.");
                System.out.printf("IT'S %s O'CLOCK! %n", wordHour.toUpperCase());
            }
            System.out.printf("%02d:%02d P.M%n", time.getHour(), time.getMinute());
        } else {
            System.out.println("GOOD MORNING");
            System.out.printf("%nIT'S %s %s A.M! %n", getCurrentHour().toUpperCase(), getCurrentMinute().toUpperCase());
            if (getCurrentMinute() == "zero") {
                System.out.println("GOOD MORNING.");
                System.out.printf("IT'S %s O'CLOCK! %n", wordHour.toUpperCase());
            }
            System.out.printf("%02d:%02d A.M%n", time.getHour(), time.getMinute());
        }

    }

    public static String unitInWords(int number) {
        return units[number];
    }

    public static String tensInWord(int number) {
        String numberInWord = null;
        int place = number / 10;
        int lastDigit = number % 10;
        if (place == 1) {
            numberInWord = tens[lastDigit];
        } else if (place >= 2 && place <= 9) {
            String firstWord = tens2[place];
            String secondWord = units[lastDigit];
            numberInWord = firstWord + " " + secondWord;
        }
        return numberInWord;
    }

    public static String convertHundreds(int number) {
        int hundred = number / 100;
        int remainder = number % 100;
        int tens = remainder / 10;
        int lastDigit = remainder % 10;
        if (remainder == 0 && tens == 0) {
            return units[hundred] + " " + thousandth[0];
        } else if (tens == 0) {
            return units[hundred] + " " + thousandth[0] + " and " + units[lastDigit] ;
        } else if (lastDigit == 0) {
            return units[hundred] + " " + thousandth[0] + " and " + tens2[tens];
        } else {
            return units[hundred]+ " " + thousandth[0] + " and " + tens2[tens] + " " + units[lastDigit];
        }
    }

    public static String convertThousandsToWords(int number) {
        int thousand = number / 1000;
        int hundred = (number % 1000) / 100;
        int tens = ((number % 1000) % 100) % 10;
        int unit = (((number % 1000) % 100) % 10) % 10;

        if (hundred == 0 && tens == 0 && unit == 0) {
            return units[thousand] + " " + thousandth[1];
        }else if( hundred == 0 ) {return units[thousand]+" "+thousandth[1]+" and "+ tens2[tens] + " " + units[unit]; }
        else if (hundred == 0 && unit == 0 ) {return units[thousand] + " " +thousandth[1] + " and " + tens2[tens];}
        return units[thousand] + " "+ thousandth[1] + "," + units[hundred] + " " + thousandth[0] + " and " + tens2[tens] + " " + units[unit];
    }

    public static String convertMillionToWords ( int number){
            int million = number / 100000;
            int hundredThousand = (number % 100000) / 10000;
            int hundredTen = (((number % 1000000)) / 1000) % 10;
            int hundredUnit = (((number % 100000) / 100) % 100) % 10;
            int ten = ((number % 100000) % 100) / 10;
            int unit = (number % 100000) % 100 % 10;

            if (hundredThousand == 0 && hundredTen == 0 && hundredUnit == 0 && ten == 0 && unit == 0) {
                return units[million] + " " + thousandth[2];
            }else if(hundredThousand == 0){
                return units[million] +" "+ thousandth[2] +  " and " + tens2[hundredTen] + " " + units[hundredUnit] +" " +thousandth[1] +  " and " + tens2[ten] + " " + units[unit];}

            return units[million] +" "+ thousandth[2] + "," + units[hundredThousand] + " " + thousandth[0] + " and " + tens2[hundredTen] + "" + units[hundredUnit] +" " +thousandth[1] +  " and " + tens2[ten] + " " + units[unit];
    }

    public static String convertBillionToWord(int number){
        return null;
    }

    public static String printNumberInWords ( int number){
            String result = null;
            if (number / 10 == 0) {
                result = unitInWords(number);
            } else if (number / 10 >= 1 && number / 10 <= 9) {
                result = tensInWord(number);
            } else if (number / 100 >= 1 && number / 100 <= 9) {
                result = convertHundreds(number);
            } else if (number / 1000 >= 1 && number / 1000 <= 9) {
                result = convertThousandsToWords(number);
            } else if (number / 100000 >= 1 && number <= 9) {
                result = convertMillionToWords(number);
            }
            return result;
    }
}
