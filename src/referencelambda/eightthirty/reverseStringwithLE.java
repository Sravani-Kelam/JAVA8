package referencelambda.eightthirty;
interface B{
    void reverseString(String str);
}
public class reverseStringwithLE {
    public static void main(String[] args){
            B b=(str)-> {
                String s1 = " ";
                for (int i = str.length() - 1; i > 0; i--) {
                    s1+=str.charAt(i);
                }
                System.out.println(s1);
            };
                String str="sravs";
                b.reverseString(str);
    }
}
