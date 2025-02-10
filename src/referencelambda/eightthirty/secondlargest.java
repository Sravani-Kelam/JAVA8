package referencelambda.eightthirty;

import java.util.Arrays;

public class secondlargest {
    public static void main(String[] args){
      int[] arr={76,384,6381,3658,675};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-3]);
    }

}
