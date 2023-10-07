package beginner2;

import java.util.Scanner;

public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        int p = s.nextInt();
        int [][]matOne = new int[m][n];
        int [][]matTwo = new int[n][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matOne[i][j] = s.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                matTwo[i][j] = s.nextInt();
            }
        }

        int [][]prodMatrix = new int[m][p];
        prodMatrix = matrixMultiplication(matOne, matTwo, prodMatrix);
        for (int i = 0; i < prodMatrix.length; i++) {
            for (int j = 0; j < prodMatrix[0].length; j++) {
                System.out.print(prodMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * method returns matrix which is product of two matrices which is of m*n and n*p
     *
     * @param matOne - matrix one
     * @param matTwo -  matrix two
     * @param prodMatrix - product of matrix one and matrix two
     * @return matrix which is product of matrix one and matrix two
     */
    private static int[][] matrixMultiplication(int[][] matOne, int[][] matTwo, int[][] prodMatrix) {

        for (int m = 0; m < matOne.length; m++) {
            for (int p = 0; p < matTwo[0].length; p++) {
                for (int n = 0; n < matOne[0].length; n++) {
                    prodMatrix[m][p] += matOne[m][n]*matTwo[n][p];
                }
            }
        }
        return prodMatrix;
    }
}
