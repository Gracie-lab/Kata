package Hackerrank;

//It is New Year's Day and people are in line for the Wonderland rollercoaster ride.
// Each person wears a sticker indicating their initial position in the queue from  to .
// Any person can bribe the person directly in front of them to swap positions,
// but they still wear their original sticker. One person can bribe at most two others.
//Determine the minimum number of bribes that took place to get to a given queue order.
// Print the number of bribes, or, if anyone has bribed more than two people, print Too chaotic.

public class NewYearChaos {

    public void getNumberOfCheats(int[] array){

        int totalBribes = 0;

        int expectedFirst = 1;
        int expectedSecond = 2;
        int expectedThird = 3;

        for (int number : array) {
            if (number == expectedFirst) {
                expectedFirst = expectedSecond;
                expectedSecond = expectedThird;
                ++expectedThird;
            } else if (number == expectedSecond) {
                ++totalBribes;
                expectedSecond = expectedThird;
                ++expectedThird;
            } else if (number == expectedThird) {
                totalBribes += 2;
                ++expectedThird;
            } else {
                System.out.println("Too chaotic");
                return;
            }
        }

        System.out.println(totalBribes);
    }
}
