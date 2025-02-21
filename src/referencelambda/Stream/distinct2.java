package referencelambda.Stream;

import java.util.Arrays;
import java.util.List;

public class distinct2 {
    public static void main(String args[]){
        List<Integer> num= Arrays.asList(22,43,23,22,26,87,78,56,26,98,46,98,25,12);
        num.stream()
                .filter(i->i%2==0)

                .distinct()
                .forEach(System.out::println);
    }
}
