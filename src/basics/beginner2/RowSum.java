package basics.beginner2;

import java.util.Scanner;

public class RowSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), m = s.nextInt();
        int mat[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = s.nextInt();
            }
        }
        int result[] = rowSum(mat);
        for(int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    private static int[] rowSum(int[][] mat) {
        int []result = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                sum += mat[i][j];
            }
            result[i] = sum;
        }
        return result;
    }
}
