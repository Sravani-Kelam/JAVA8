package referencelambda.Stream;

import java.util.Arrays;
import java.util.List;

public class distinctmethod {
    public static void main(String args[]){
        List<Integer> a= Arrays.asList(1,3,8,7,4,112,6,7,10,8,20);
        a.stream()
                .filter(i->i%2==0)
                .distinct()
                .map(i->i*2)
                .sorted()
                .forEach(System.out::println);
    }
}
