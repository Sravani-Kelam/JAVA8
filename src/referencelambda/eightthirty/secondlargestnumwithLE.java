package referencelambda.eightthirty;

import java.util.Arrays;

interface A{
     void secondlargestnumber(int[] arr);
}
public class secondlargestnumwithLE {
    public static void main(String[] args){
        A a=(arr)->{
            Arrays.sort(arr);
            System.out.println(arr[arr.length-4]);
        };
        int[] arr={76,384,6381,3658,675};
        a.secondlargestnumber( arr);
    }
}
