package ConverterUtils;

public class Converter {
    public static double convertInchToMeter(double valueInInches){
        return valueInInches*0.0254;
    }

    public static int convertMinutesToDays(long minute){
        return (int) (minute/1440);
    }
    public static int convertMinutesToYearsAndDays(long minute){
        //convert to days
        //convert days to years
        //525600 minutes make one year
        int numberOfYears = convertMinutesToDays(minute)/365;
//        int numberOfYears = (int) (minute/525600);
        return numberOfYears;
    }
}
