package rotateLeft;

public class Rotate {

    public int[] rotateLeft(int[] array, int numberOfRotation){
        int[] newArray = new int[array.length];
            for (int index = 0; index < array.length; index++) {
                newArray[index] = array[(index + numberOfRotation) % array.length];
                }
        return newArray;
    }
}
