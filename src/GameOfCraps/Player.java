package GameOfCraps;
import java.util.Random;

public class Player {
    Random random = new Random();
    private int die1;
    private int die2;
    private int point;
    private static int sum;
    private static String status;
    private int bankBalance = 1000;

    int count = 1;

    public void rollDice() {
        die1 = 1 + random.nextInt(6);
        die2 = 1 + random.nextInt(6);
        sum = die1 + die2;
    }

    public String setStatus() {
        if ((sum == 7 || sum == 11) && count == 1) {
            status = "You won!";
            count++;
        } else if ((sum == 2 || sum == 3 || sum == 12) && count == 1) {
            status = "You lost";
            count++;
        } else if ((sum == 5 || sum == 4 || sum == 6 || sum == 8 || sum == 9 || sum == 10) && count == 1) {
            point = sum;
            status = "Continue";
            System.out.printf("Your point is %d. Good luck%n", sum);
            count++;
        }
        return status;
    }

    public String play() {
        rollDice();
        System.out.printf("You played %d%n", sum);
        setStatus();
        while (status == "Continue") {
            System.out.println("Playing again");
            rollDice();
            if (sum == 7 && count > 1) {
                status = "You lost";
            } else if ((sum == point) && count > 1) {
                status = "You won";
            }
            count++;
        }
        return status;
    }

    public int wager(int wager) {
        if (wager <= bankBalance) {
            rollDice();
            setStatus();
            if (setStatus() == "You won") {
                bankBalance += wager;
                return bankBalance;
            }
            if (setStatus() == "You lost") {
                bankBalance -= wager;
                return bankBalance;
            }else{
                System.out.println("To continue");
            }
        }
        return bankBalance;
    }

    public void playWager(int wager){
        wager(wager);
        while (setStatus() == "Continue"){
            wager(wager);
            if (bankBalance == 0){
                System.out.println("Busted! Game over.");
            }
        }
    }
//                else {
//                    while (setStatus() == "continue"){
//                        rollDice();
//                        setStatus();
//                    }
//                }
//            }
//            if (bankBalance == 0) {
//                System.out.println("Busted! Game over");
//            }
//
//
//        return bankBalance;
//    }
}
