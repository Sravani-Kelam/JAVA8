package referencelambda.eightthirty;

interface M{
    public void m1(int x);
}
public class positiveornotwithLE {
    public static void main(String args[]){
        M m=(x) -> System.out.println(x>0);
        m.m1(-2);
    }
}
