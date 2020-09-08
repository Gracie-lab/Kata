package Binary;

public class Binary {
    private String number;

    public void setNumber(String binaryNumber) {
        this.number = binaryNumber;
    }

    public String getNumber() {
        return number;
    }

    public static int convertToDecimal(String binaryNumber){
//        this.number = binaryNumber;
        int toDecimal = 0;
        char[] digits = binaryNumber.toCharArray();
        int length = digits.length-1;
        for (char number : digits){
            toDecimal += (Integer.parseInt(String.valueOf(number)) * Math.pow(2,length));
            length--;
        }
//        System.out.print(toDecimal);
        return toDecimal;

    }
}
