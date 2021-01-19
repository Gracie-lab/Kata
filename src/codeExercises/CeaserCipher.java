package codeExercises;

import java.util.List;

public class CeaserCipher {

    public String encodeMessage(String message, Integer numberOfRotation){
        StringBuilder encryptedMessage = new StringBuilder();
       char[] letters = message.toCharArray();

       for(char letter : letters){
           if(letter == ' ') {
               letter = ' ';
           }
           else{
               letter = (char) (((letter - 'a') + numberOfRotation % 26) + 'a');
               encryptedMessage.append(letter);
           }
       }

       return String.valueOf(encryptedMessage);
    }
}
