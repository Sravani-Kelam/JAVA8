package referencelambda.eightthirty;
interface Y{
    public void m1(int a, int b);
}
public class greatestwithLE {
    public static void main(String args[]){
        Y y=(a,b)->System.out.println(a>b?a:b);
        y.m1(78,998);
    }
}
