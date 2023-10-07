package beginner2;

import java.util.Scanner;

public class IdentifyingIdentityMatrix {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = s.nextInt();
            }
        }
        System.out.print(verifyIdentityMatrix(matrix));
    }

    private static boolean verifyIdentityMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i == j && matrix[i][j] != 1) || (i != j && matrix[i][j] != 0)) {
                    return  false;
                }
            }
        }
        return true;
    }
}
