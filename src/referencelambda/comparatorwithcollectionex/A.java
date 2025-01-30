package referencelambda.comparatorwithcollectionex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class A implements Comparator<Integer> {
    public int compare(Integer a1,Integer a2) {
        if (a1 < a2) {
            return -1;
        } else if (a1 > a2) {
            return +1;
        } else {
            return 0;
        }

    }
}
class  Test extends A{
    public static void main(String args[]){
        List l1=new ArrayList<>();
                l1.add(6);
                l1.add(27);
                l1.add(98);
                l1.add(34);
                l1.add(56);
                System.out.println(l1);
        Collections.sort(l1,new A());
        System.out.println(l1);
    }
}
