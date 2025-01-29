package referencelambda.sortarray;

import java.util.Arrays;

interface a{
    public void A(int i);
}
public class forwithLE {
    public static void main(String args[]){
        int[] arr={1,9,5,76,34};
        Arrays.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
}
