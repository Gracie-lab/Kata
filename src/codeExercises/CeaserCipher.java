package codeExercises;

import java.util.List;

public class CeaserCipher {

    public char[] decodeMessage(String message, Integer numberOfRotation){
       char[] letters = message.toCharArray();
       for(char letter : letters){
           letter = (char) (letter + 5);
       }
       return letters;
    }
}
