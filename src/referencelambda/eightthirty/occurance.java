package referencelambda.eightthirty;

import java.util.HashMap;

public class occurance {
    public static void main(String args[]){
        int[] arr={1,2,1,3,4,6,7,2,3,5,2,8};
        HashMap<Integer,Integer>a=new HashMap<>();
        for(int num:arr){
            a.put(num,a.getOrDefault(num,0)+1);
        }
        for(int Keys:a.keySet()){
            System.out.println(Keys+"-"+ a.get(Keys));
        }
    }
}
