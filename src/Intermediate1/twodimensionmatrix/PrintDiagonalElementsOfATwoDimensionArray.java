package Intermediate1.twodimensionmatrix;

import java.util.Scanner;

public class PrintDiagonalElementsOfATwoDimensionArray {

    /**
     * Method to print all the diagonals of given 2D Array
     * Example -
     * [1 2 3]
     * [4 5 6]
     * [7 8 9]
     * Output - 1 2 4 3 5 7 6 8 9
     * @param twoDArray - 2D Array
     */
    private static void printAllDiagonalElementsOfATwoDArray(int[][] twoDArray) {
        int n = twoDArray.length;
        int m = twoDArray[0].length;
        for (int col = 0; col < m-1; col++) {
            int i = 0, j = col;
            while (j >= 0) {
                System.out.print(twoDArray[i][j] + " ");
                i++;
                j--;
            }
        }
        for (int row = 0; row < n; row++) {
            int j = m-1, i = row;
            while (i < n) {
                System.out.print(twoDArray[i][j] + " ");
                i++;
                j--;
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [][]TwoDArray = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                TwoDArray[i][j] = s.nextInt();
            }
        }
        printAllDiagonalElementsOfATwoDArray(TwoDArray);
    }
}
