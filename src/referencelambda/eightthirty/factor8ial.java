package referencelambda.eightthirty;

public class factor8ial {
   static int m1(int n) {
        int a= 1;
        for (int i = 2; i <= n; i++) {
            a *= i;
        }
        return a;
    }
        public static void main(String[] args){
            System.out.println(m1(3));
        }
}
