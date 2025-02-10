package referencelambda.eightthirty;

interface S{
    public void m1(int x);
}
public class evenoroddwithLE {
    public static void main(String args[]){
        S s=(x)->System.out.println(x%2==0);
        s.m1(78);
    }
}
