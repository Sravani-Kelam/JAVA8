package referencelambda.Stream;

import java.util.Arrays;
import java.util.List;

public class Skipmethod {
    public static void main(String args[]){
        List<Integer> l2= Arrays.asList(2,4,6,8,10,12,14,16,18);
        l2.stream()
        .skip(2)
        .forEach(System.out::println);
    }
}
