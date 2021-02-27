package Hackerrank;

public class MinimumSwaps {

//    You are given an unordered array consisting of consecutive integers  [1, 2, 3, ..., n]
//    without any duplicates. You are allowed to swap any two elements.
//    You need to find the minimum number of swaps required to sort the array in ascending order.

        public static int swap(int[] array){
            int count = 0;

            for(int index = 0; index<array.length; index++){
                int originalNumber = array[index];
                if(array[index] != index+1){
                    int temp = array[originalNumber-1];
                    array[originalNumber-1] = array[index];
                    array[index] = temp;
                    count++;
                    index=0;
                }

            }
            return count;
        }

}
