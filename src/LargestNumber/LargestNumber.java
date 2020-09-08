package LargestNumber;

import java.util.*;

public class LargestNumber {
    static List<Integer> number;

    public List<Integer> getNumber() {
        return number;
    }

    public void setNumber(int numberToAdd) {
        number.add(numberToAdd);
    }

    public void findLargestNumber(){
        Collections.max(number);
    }
}
