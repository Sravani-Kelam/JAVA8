package referencelambda.eightthirty;

interface D{
    public void m1(int l);
}
public class areaofsquarewithLE {
    public static void main(String[] args){
        D d=(l )-> System.out.println(l*l);
        d.m1(9);
    }
}
