package referencelambda.eightthirty;

interface Z{
    public void m1(int a,int b);
}
public class leastwithLE {
    public static void main(String[] args){
      Z z=(a,b)->System.out.println(a<b?a:b);
      z.m1(314,79);
   }
}
