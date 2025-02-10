package referencelambda.eightthirty;
interface N{
    public void m1(int x);
}
public class threedigitwithLE {
    public static void main(String args[]){
        N n=(x)->System.out.println(x>100 && x<999);
        n.m1(986);
    }
}
