package referencelambda.eightthirty;

import java.util.Arrays;

public class addarray {
    public static void main(String[] args){
        int[] arr1={1,4,6,2,8};
        int[] arr2={2,3,5,9};
        int[] n=new int[arr1.length+arr2.length];
        int index=0;
        for(int num:arr1) n[index++]=num;
        for(int num:arr2) n[index++]=num;
                    System.out.println(n);
        Arrays.sort(n);
        System.out.println("sorted array:" +Arrays.toString(n));
    }
}
