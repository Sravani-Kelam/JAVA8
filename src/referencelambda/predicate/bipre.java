package referencelambda.predicate;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class bipre {
    public static void main(String args[]){
        BiPredicate<Integer,Integer> p= (x,y)->(x%5==0) && (y%3==0);
        System.out.println(p.test(10,966));
        System.out.println(p.test(456,96));
    }

}
