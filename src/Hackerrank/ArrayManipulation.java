package Hackerrank;


//Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each the array element between two given indices, inclusive.
//Once all operations have been performed, return the maximum value in the array.

public class ArrayManipulation {

    public int[] manipulateArray(int[] initialArray){
            int[] newArray = new int[6];
            int startingIndex = initialArray[0];
            int endingIndex = initialArray[1];
            int counter = startingIndex;
            while(counter <= endingIndex){
                newArray[counter] += initialArray[2];
                counter++;
            }
            return newArray;
    }

    public int[][] man(int[][] array){
        int[][] newArray = new int[6][6];

            int row = 0;
            int rowOfResultingArray = 1;
            int startingIndex = array[row][0] ;
            int endingIndex = array[row][1];
            int counter = startingIndex;
            while(counter <= endingIndex){
                newArray[rowOfResultingArray][counter] += array[row][2];
                counter++;
            }
            rowOfResultingArray++;

        return newArray;
    }

}
