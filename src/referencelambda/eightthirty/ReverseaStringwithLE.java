package referencelambda.eightthirty;

interface  C{
    void m1(String str);
}
public class ReverseaStringwithLE {
    public static void main(String[] args){
        String str="Sravani";
       C c=(s)->System.out.println(new StringBuilder(str).reverse());
       c.m1(str);
    }
}













