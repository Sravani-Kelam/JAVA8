package referencelambda.function;

import java.util.function.Function;

public class test {
    public static void main(String[] args){
        Function<String,Integer>lengthofString=str->str.length();
                System.out.println(lengthofString.apply("hello"));
                System.out.println(lengthofString.apply("Sravani"));
    }
}
