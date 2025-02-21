package referencelambda.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class bifun3 {
    public static void main(String args[]){
        BiFunction<String,String,String> a= (m, n)->m+"  " +n;
        System.out.println(a.apply("hii","goodmorning"));
    }
}
