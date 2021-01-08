package codeExercises;

import java.util.List;

public class Average {

    public double findAverage(List<Integer> numbers){
        double sum = numbers.stream().mapToDouble(Integer::intValue).sum();
        double average = sum / numbers.size();

        return average;
    }
}
