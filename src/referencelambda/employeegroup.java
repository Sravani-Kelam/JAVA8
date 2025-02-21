package referencelambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class employeegroup {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 15, 9, 24, 33, 36);

        // Using Stream to filter, map, and collect
        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n % 3 == 0)
                .map(n -> n*3)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(filteredNumbers);
    }
}
