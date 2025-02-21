package referencelambda.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class upper {
    public static void main(String args[]){
        List<String> abc = Arrays.asList("sri", "siri", "ajju", "avi", "teju", "ramu", "sravs");
        List<String> b = abc.stream()
                .filter( a->a.length()>4)
                .map(String::toUpperCase)
                .sorted()
                .collect (Collectors .toList());
        b.forEach(System.out::println);
    }
}
