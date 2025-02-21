package referencelambda.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class B {
    public static void main(String args[]){
        List<Integer> l1=Arrays.asList(1,3,5,7,9,2,4,6,8);
        l1.stream().map(i->i*3).forEach(System.out::println);

    }
}
