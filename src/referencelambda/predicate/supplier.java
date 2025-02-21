package referencelambda.predicate;

import java.util.function.Supplier;

public class supplier {
    public static void main(String args[]){
        Supplier<String> Supplier=()->"hello";
        System.out.println(Supplier.get());
    }

    }
