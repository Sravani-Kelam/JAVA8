package referencelambda.eightthirty;

public class Vowels {
    public static void main(String[] args){
        System.out.println(m1("rhythm"));
        System.out.println(m1("avi"));
    }
    public static boolean m1(String s1){
        return s1.toLowerCase().matches(".*[aeiou]*.");
    }
}
