package referencelambda.coding;

import java.util.Arrays;

public class arr{
    public static void main(String args[]){
        int[] a={2,3,5,7,1,4,9 };
        int[] b={34,76,59,86,32,27};
        int[] c=new int[a.length+b.length];
        int index=0;
        for(int num:a)c[index++]=num;
        for(int num:b)c[index++]=num;
        Arrays.sort(c);
        System.out.println("sorting arrays:"+Arrays.toString(c));
    }
}
