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
        int row = 0;
        int rowOfResultingArray = 1;
        int[][] newArray = new int[5][5];
            while(row < array.length) {
                int startingIndex = array[row][0]-1;
                int endingIndex = array[row][1]-1;
                int counter = startingIndex;
                while (counter <= endingIndex) {
                    newArray[rowOfResultingArray][counter] += array[row][2];
                    newArray[rowOfResultingArray+1][counter] += array[row][2];
                    counter++;
                }
                rowOfResultingArray++;
//                for(int index =0; index<array.length-1; index++){
//                    newArray[rowOfResultingArray+1][index] = newArray[rowOfResultingArray][index];
//                    array[row+1][index] = array[row][index];
//                }
                row++;

            }

        return newArray;
    }

}
