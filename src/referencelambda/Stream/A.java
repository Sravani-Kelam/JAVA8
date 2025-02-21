package referencelambda.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
    List<Integer> numbers = Arrays.asList(1, 6, 4, 5, 3, 8);
    List<Integer> Square = numbers;

    public A() {
        Square = numbers.stream()
                .map(i -> i * i)
                .collect(Collectors.toList());
    }
}
