package referencelambda.predicate;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class consumersupplier {
    public static void main(String args[]){
        int num=8;
        Supplier<String> S1=()->(num%2==0)?"even":"odd";
        Consumer<String> C12=result->System.out.println(result);
        C12.accept(S1.get());
    }
}
