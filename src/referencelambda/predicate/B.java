package referencelambda.predicate;

import java.util.function.Predicate;

public class B {
    public static void main(String[] args) {
        Predicate<String> String = str -> str.length() > 5;
        System.out.println(String.test("Hello"));
        System.out.println(String.test("my world"));
    }
}
