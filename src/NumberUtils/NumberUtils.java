package NumberUtils;

import java.time.LocalTime;

public class NumberUtils {
    private static int hour;
    private static int minute;
    private static String minuteWord = null;
    private static String wordHour = null;
    static LocalTime time = LocalTime.now();
    
    private static  String[] hourInWord = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three"};
    private static String[] units = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static String[] tens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static String[] twenties = {"twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"};
    private static String[] thirties = {"thirty", "thirty one", "thirty two", "thirty three", "thirty four", "thirty five", "thirty six", "thirth seven", "thirthy eight", "thirty nine"};
    private static String[] fourties = {"forty", "forty One", "forty two", "forty three", "forty four", "forty five", "forty six", "forty seven", "forty eight", "forty nine"};
    private static String[] fifites = {"fifty", "fifty One", "fifty two", "fifty three", "fifty four", "fifty five", "fifty six", "fifty seven", "fifty eight", "fifty nine"};

    public NumberUtils(){

    }

    public NumberUtils(int hour, int minute){
        if(hour >= 0 && hour <=12){
            this.hour = hour;
        }
        if(minute >= 0 && minute <=59){
            this.minute = minute;
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String convertHourToWords () {
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

    public String convertMinuteToWords () {
        int index = minute % 10;
        for (int i = 0; i < tens.length; i++) {
            if (minute / 10 == 1) {
                minuteWord = tens[index];
            } else if (minute / 10 == 2) {
                minuteWord = twenties[index];
            } else if (minute / 10 == 3) {
                minuteWord = thirties[index];
            } else if (minute / 10 == 4) {
                minuteWord = fourties[index];
            } else if (minute / 10 == 5) {
                minuteWord = fifites[index];
            } else {
                minuteWord = units[minute];
            }
        }
//        System.out.println(minuteWord);
        return minuteWord;
    }

    public void printTimeInWord () {
        System.out.printf("%02d : %02d%n", hour, minute);
        if (convertMinuteToWords() == "zero") {
            System.out.printf("It's %s o'clock! %n", wordHour);
        } else {
            System.out.printf("%nIt's %s %s! %n", wordHour, minuteWord);
        }
    }

    public static String getCurrentHour(){
        for (int i = 0; i < hourInWord.length; i++){
            if(time.getHour() == i){
                wordHour = hourInWord[i];
            }
        }
        if(time.getHour() == 0){
            wordHour = hourInWord[12];
        }
        return wordHour;
    }

    public static String getCurrentMinute(){
        int index = time.getMinute() % 10;
        for (int i = 0; i < tens.length; i++){
            if(time.getMinute() / 10 == 1){
                minuteWord = tens[index];
            }
            else if( time.getMinute() / 10 == 2){
                minuteWord = twenties[index];
            }
            else if( time.getMinute() / 10 == 3){
                minuteWord = thirties[index];
            }
            else if( time.getMinute() / 10 == 4){
                minuteWord = fourties[index];
            }
            else if( time.getMinute() / 10 == 5){
                minuteWord = fifites[index];
            }
            else{
                 minuteWord = units[time.getMinute()];
            }
        }
        return minuteWord;
    }

    public static void whatIsTheTime(){
        if (time.getHour() >= 12 && time.getHour()<= 15){
            System.out.println("GOOD AFTERNOON.");
            System.out.printf("%nIT'S %s %s P.M! %n", getCurrentHour().toUpperCase(), getCurrentMinute().toUpperCase());
            if(getCurrentMinute() == "zero"){
                System.out.println("GOOD AFTERNOON.");
                System.out.printf("IT'S %s O'CLOCK! %n", wordHour);
            }
        }
        else if (time.getHour()>= 16 && time.getHour()<=23){
            System.out.println("GOOD EVENING.");
            System.out.printf("%nIT'S %s %s P.M! %n", getCurrentHour().toUpperCase(), getCurrentMinute().toUpperCase());
            if(getCurrentMinute() == "zero"){
                System.out.println("GOOD EVENING.");
                System.out.printf("IT'S %s O'CLOCK! %n", wordHour.toUpperCase());
            }
        }
        else{
                System.out.println("GOOD MORNING");
                System.out.printf("%nIT'S %s %s A.M! %n", getCurrentHour().toUpperCase(), getCurrentMinute().toUpperCase());
            if(getCurrentMinute() == "zero"){
                System.out.println("GOOD MORNING.");
                System.out.printf("IT'S %s O'CLOCK! %n", wordHour.toUpperCase());
            }
        }
        System.out.printf("%02d:%02d P.M%n", time.getHour(), time.getMinute());
    }

    private static String[] numberUnits = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    private static String[] numberTens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    private static String[] tens2 = {"", " ", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    private static String[] hundreds = {"", "one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred", "eight hundred", "nine hundred"};
    private static String[] thousands = {"", "one thousand", "two thousand", "three thousand", "four thousand", "five thousand", "six thousand", "seven thousand", "eight thousand", "nine thousand"};
    private static String[] millions ={"", "one million", "two million", "three million", "three million", "four million", "five million", "six million", "seven million", "eight million", "nine million"};
    private static int number;

    public static String unitInWords(int number){
            String numberInWord = numberUnits[number];
            return numberInWord;
    }
    public static String tensInWord(int number){
        String numberInWord = null;
        int place = number / 10;
        int lastDigit = number % 10;
            if (place == 1){
                numberInWord = numberTens[lastDigit];
            }
            else if (place >= 2 && place <= 9){
                String firstWord = tens2[place];
                String secondWord = units[lastDigit];
                numberInWord = firstWord + " " + secondWord;
            }
        return numberInWord;
    }

    public static String convertHundreds(int number){
        int hundred = number / 100;
        int remainder = number % 100;
        int tens = remainder / 10;
        int lastDigit = remainder % 10;
        String firstWord = hundreds[hundred];
        String secondWord = tens2[tens];
        String thirdWord = numberUnits[lastDigit];
        return firstWord + " and " + secondWord +" " + thirdWord;
    }

    public static String convertThousandsToWords(int number){
        int thousand = number / 1000;
        int hundred = (number % 1000) / 100;
        int tens = ((number % 1000) % 100)% 10;
        int unit = (((number % 1000)% 100)%10)%10;
        String firstWord = thousands[thousand];
        String secondWord = hundreds[hundred];
        String thirdWord = tens2[tens];
        String lastWord = numberUnits[unit];
        if(hundred == 0 && tens == 0 && unit == 0){
            return firstWord;
        }
        return firstWord + "," + secondWord + " and " + thirdWord + " " + lastWord;
    }

    public static String convertMillionToWords(int number){
        int million = number / 100000;
        int hundredThousand = (number % 100000)/10000;
        int hundredTen = (((number % 1000000))/1000)%10;
        int hundredUnit = (((number % 100000)/100)%100)%10;
        int ten = ((number%100000)%100)/10;
        int unit = (number%100000)%100%10;

        String firstWord = millions[million];
        String secondWord = hundreds[hundredThousand];
        String thirdWord = tens2[hundredTen];
        String fourthWord = thousands[hundredUnit];
        String fifthWord = tens2[ten];
        String lastWord = numberUnits[unit];

        if(hundredThousand == 0 && hundredTen == 0 && hundredUnit == 0 && ten == 0 && unit == 0){
            return firstWord;
        }
        return firstWord + "," + secondWord + " and " + thirdWord + "" + fourthWord + " and " + fifthWord + " " + lastWord;
    }

    public static String printNumberInWords(int number){
        String result = null;
        if (number / 10 == 0){
            result = unitInWords(number);
        }
        else if (number/10 >= 1 && number/10 <= 9){
            result = tensInWord(number);
        }
        else if (number / 100 >= 1 && number / 100 <= 9){
            result = convertHundreds(number);
        }
        else if (number / 1000 >= 1 && number/1000 <= 9){
            result = convertThousandsToWords(number);
        }
        else if (number / 100000 >=1 && number <= 9){
           result = convertMillionToWords(number);
        }
        return result;
    }


}

