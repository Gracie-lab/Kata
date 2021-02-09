package Hackerrank;

public class NewYearChaos {

    public void getNumberOfCheats(int[] array){
        String chaotic = " ";
        int numberOfCheats = 0;
            for (int index = 0; index < array.length; index++) {
                if (array[index] - index + 1 > 2) {
                    System.out.println(array[index]-(index+1));
                    System.out.println("Too chaotic");
                    return;
                }
                else {
                    System.out.println(array[index]-(index+1));
                }
            }


    }
}
