package referencelambda.swapping;

public class withoutLE {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("Before swapping:  " + a + ",  " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping:  a:" + a+  ", b:" + b);
       /* a=a+b;
        b=a-b;
        a=a+b;
        System.out.println(a,b);*/
    }
}

