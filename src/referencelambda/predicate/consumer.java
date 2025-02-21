package referencelambda.predicate;

import java.util.function.Consumer;

public class consumer {
    public static void main(String args[]){
        Consumer<Integer> C=I->System.out.println(I%3==0);
          C.accept(66998);
          C.accept(99999);

    }
}
