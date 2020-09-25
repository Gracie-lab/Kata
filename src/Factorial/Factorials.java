package Factorial;

public class Factorials {
    public static void calculateFactorialOfOneToTwenty(){
        int number = 1;
        long factorialOfNumber = 1;
        System.out.printf("N%25s%n%n", "N!");
         while(number <=20){
            for(int counter = 1; counter <= number; counter++){
                factorialOfNumber *= counter;
            }
            System.out.printf("%d%25d%n", number, factorialOfNumber);
            factorialOfNumber=1;
            number++;
        }
    }

    public static long calculateFactorial(int number){
        long factorialOfNumber = 1;
        for (int counter = 1; counter <= number; counter++){
            factorialOfNumber *= counter;
        }
        return factorialOfNumber;
    }
}
