package ConverterUtils;

public class Converter {
    public static double convertInchToMeter(double valueInInches){
        return valueInInches*0.0254;
    }

    public static int convertMinutesToDays(long minute){
        return (int) (minute/1440);
    }

    public static String convertMinutesToYearsAndDays(long minute){
        int numberOfDays = convertMinutesToDays(minute)%365;
        int numberOfYears = convertMinutesToDays(minute)/365;
        return String.format("%d minutes is approximately %d years and %d days", minute, numberOfYears, numberOfDays);
    }
}
