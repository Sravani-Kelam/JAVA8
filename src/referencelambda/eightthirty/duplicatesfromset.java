package referencelambda.eightthirty;

import java.util.*;

public class duplicatesfromset {
    public static void main(String[] args){
        List<Integer> l1= new ArrayList<>(Arrays.asList(1,4,3,2,2,4,5,7,1,5,6));
        Set<Integer> s1=new HashSet<>(l1);
        l1.clear();
        l1.addAll(s1);
        System.out.println(l1);
    }
}
