package referencelambda.predicate;

import java.util.function.BiFunction;

public class bifun {
    public static void main(String args[]){
        BiFunction<String,String,String>c=(x,y)->x+ " " +y;
        System.out.println(c.apply("aru","ajju"));
        System.out.println(c.apply("aru","avi"));
    }
}
