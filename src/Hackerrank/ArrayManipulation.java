package Hackerrank;


//Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each the array element between two given indices, inclusive.
//Once all operations have been performed, return the maximum value in the array.

public class ArrayManipulation {
    int[][] resultingArray;

    public int manipulateArray(int[][] array){
        int firstIndex = 0;
        int lastIndex = 0;
        for(int row=0; row<array.length; row++){
            for(int column = 0; column<array[row].length; column++) {
                firstIndex = array[row][column];
                if (column + 2 == array.length - 1){
                    lastIndex = array[row][column+1];
                }
            }
        }

    }
}
