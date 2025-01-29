package referencelambda.sortarray.withLE;

import java.util.Arrays;

interface A{
    public void  A(int a, int b);
}
public class arr {
    public static void main(String args[]){
        Integer[] arr={1,9,87,56,34,29};
        Arrays.sort(arr,(a,b)->Integer.compare(a,b));
        System.out.println(Arrays.toString(arr));
        //descending order
        Arrays.sort(arr,(a,b)->b-a);
        System.out.println(Arrays.toString(arr));
        //ascending order
        Arrays.sort(arr,(a,b)->a-b);
        System.out.println(Arrays.toString(arr));
    }
}
