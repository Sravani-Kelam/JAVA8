package referencelambda.Stream;

import java.util.Arrays;
import java.util.List;

public class limit1 {
    public static void main(String args[]){
        List<Integer> num= Arrays.asList(1,3,5,7,11,13,151,123);
        num.stream()
                .sorted()
                .limit(7)
                .skip(2)
                .forEach(System.out::println);
    }
}
