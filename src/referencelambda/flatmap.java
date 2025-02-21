package referencelambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class flatmap {
    public static void main(String[] args) {
        List<List<String>> namesList = Arrays.asList(
                Arrays.asList("hii", "gm"),
                Arrays.asList("nice", "meeting you")
        );
        List<String> flatList = namesList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flatList);
    }
}