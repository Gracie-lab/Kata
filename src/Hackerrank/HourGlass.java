package Hackerrank;

//this program gets the highest sum of hourglass in a 6by6 array
public class HourGlass {
    int highestSumOfHourGlass = Integer.MIN_VALUE;
    private static int[][] array = new int[6][6];

    public int getHighestSumOfHourglass(){
        for(int row = 0; row<array.length-2; row++){
            for(int column = 0; column< array.length-2; column++) {
                int sumOfHourGlass = array[row][column] + array[row][column + 1] + array[row][column + 2]
                        + array[row + 1][column + 1] + array[row + 2][column] + array[row + 2][column + 1]
                        + array[row + 2][column + 2];

                highestSumOfHourGlass = Math.max(highestSumOfHourGlass, sumOfHourGlass);
            }

        }
        return highestSumOfHourGlass;
    }
}
