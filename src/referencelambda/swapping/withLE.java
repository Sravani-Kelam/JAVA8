package referencelambda.swapping;
interface A{
     void m1(int a, int b);
}
public class withLE {
    public static void main (String[] args){

        A x=(a,b)->{int temp=0;a=b;b=a;a=temp;};
        System.out.println("before swapping");
        x.m1(5,7);
        System.out.println("after swapping");

    }
}
