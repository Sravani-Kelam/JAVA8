package referencelambda.eightthirty;

import java.util.Arrays;

public class ARR{
        public static void main(String args[]){
            int[] a1={3,6,7,1,5};
            int[] a2={9,78,65,45};
            int[] n=new int[a1.length+a2.length];
            int index=0;
            for(int num:a1)n[index++]=num;
            for(int num:a2)n[index++]=num;
            Arrays.sort(n);
            System.out.println("sorting arrays:"+Arrays.toString(n));
        }
    }
