package codeExercises;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsLambdas {

    public double findAverage(List<Integer> numbers){
        double sum = numbers.stream().mapToDouble(Integer::intValue).sum();
        double average = sum / numbers.size();

        return average;
    }

    public List<String> upperCase(List<String> words){
       return words.stream().
                map(String:: toUpperCase).
                collect(Collectors.toList());
    }

    public List<String> findWordStartingWithLetter(List<String> words, String letter){
      return  words.stream().filter(word -> word.startsWith(letter)).collect(Collectors.toList());
    }
}
