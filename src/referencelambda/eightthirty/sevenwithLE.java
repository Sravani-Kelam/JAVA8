package referencelambda.eightthirty;

interface E{
    public void m1(int x);
}
public class sevenwithLE {
    public static void main(String[] args){
        E e=(x)->System.out.println( x%7==0);
        e.m1(578907);
    }
}
