package referencelambda.coding;

public class febi {
    public static void main(String args[]) {
        int n = 10;
        int a = 0;
        int b = 1;
        System.out.println("print febi" + n + " terms:");
        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }
}