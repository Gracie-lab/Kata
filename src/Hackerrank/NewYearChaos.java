package Hackerrank;

public class NewYearChaos {

    public void getNumberOfCheats(int[] array){
            for (int index = 0; index < array.length; index++) {

                int differenceInLocation = array[index]-(index+1);

                System.out.println(array[differenceInLocation);
                if (differenceInLocation > 2) {
                    System.out.println("Too chaotic");
                    return;
                }
            }
    }
}
