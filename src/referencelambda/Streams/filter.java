package referencelambda.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filter {
    public static void main(String[] args){
        List<Integer>l1= Arrays.asList(1,8,4,5,3,6,2,6,9);
        long count= l1.stream()
        .filter(i->i<7).count();

        System.out.println(l1);
    }
}
