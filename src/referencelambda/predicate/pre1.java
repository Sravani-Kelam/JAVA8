package referencelambda.predicate;

import java.util.function.Predicate;

public class pre1 {
    public static void main(String args[]){
        Predicate<Integer> x=i->i%2==0;
        System.out.println(x.test(902789));
    }
}
