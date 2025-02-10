package referencelambda.eightthirty;

interface F{
    public void m1(int l,int b);
}
public class areaofrectanglewithLE {
    public static void main(String[] args){
        F f=(int l, int b)-> System.out.println(l*b);
        f.m1(6,5);
    }

}
