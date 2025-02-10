package referencelambda.eightthirty;

public class transposematrix {
    public static void main(String args[]) {
        int a[][] = {{2, 3, 4}, {5, 6, 7}, {8, 9, 1}};
        int c[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[j][i];
                System.out.println(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
