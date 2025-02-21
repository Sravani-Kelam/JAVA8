package referencelambda.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class squaring {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> Square = numbers.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());
        System.out.println(Square);
    }
}
