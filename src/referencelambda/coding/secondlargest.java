package referencelambda.coding;

import java.util.Arrays;

public class secondlargest {
    public static void main(String[] args){
        int[] arr={1234,567687,23446,89865,23,765,90675};
        Arrays.sort(arr);
        System.out.println("secondlargest number:" +arr[arr.length-5]);
    }
}
