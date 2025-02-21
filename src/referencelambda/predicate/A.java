package referencelambda.predicate;

import java.util.function.Function;

public class A {
    public static void main(String[] args) {
        Function<Integer, String> intToString = num -> "Number: " + num;
        System.out.println(intToString.apply(10));
    }
}

