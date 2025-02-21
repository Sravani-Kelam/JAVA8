package referencelambda.predicate;

import java.util.function.BiPredicate;

public class bipre1 {
    public static void main(String args[]){
        BiPredicate<String,String>a=(m,n)->(m.length()<5) && (n.length()>5);
        System.out.println(a.test("hi" ,"hello world"));
        System.out.println(a.test("hi" ,"hii"));
    }
}
