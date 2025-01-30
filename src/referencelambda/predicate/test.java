package referencelambda.predicate;

import java.util.function.Predicate;

public class test {
    public static void main(String[] args){
        Predicate<Integer> P=I->I%2==0;
        System.out.println(P.test(10));
        System.out.println(P.test(5));
    }
}
