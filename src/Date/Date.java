package Date;

public class Date {
    private static int month;
    private static int day;
    private static int year;

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }


    public int getYear() {
        return year;
    }


    public Date(int day, int month, int year) {
        if(month <=12){
            Date.month = month;
        }
        if(day <=31){
            Date.day = day;
        }
        if (year > 0){
            Date.year = year;
        }
    }

    public static String displayDate(){

        return String.format("%d/%d/%d", day, month, year);
    }
}

