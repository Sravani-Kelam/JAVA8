package referencelambda.eightthirty;
interface G{
    public void m1(int x);
}
public class threewithLE {
 public static void main(String args[]){
     G g=(x)->System.out.println( x%3==0);
     g.m1(6666666);
 }
}
