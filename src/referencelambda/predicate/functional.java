package referencelambda.predicate;

import java.util.function.Function;

public class functional {
    public static void main(String args[]){
        Function<Integer,Boolean> f=I->I%3==0;
        System.out.println(f.apply(39872));
        System.out.println(f.apply(99999));
    }
}
