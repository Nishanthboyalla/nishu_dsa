package basics.Intermediate1.twodimensionmatrix;

import java.util.Scanner;

public class PrintElementsInSpiralOrder {

    /**
     * Method that prints elements of given 2D Array in spiral order
     * @param input - 2D Array
     */
    private static void printElementsInSpiralOrder(int[][] input) {
        int N = input.length;
        int i = 0, j = 0;
        while (N >= 1) {
            //To print top row of 2D matrix
            for (int k = 1; k < N; k++) {
                System.out.print(input[i][j] + " ");
                j++;
            }

            //To print last column of 2D matrix
            for (int k = 1; k < N; k++) {
                System.out.print(input[i][j] + " ");
                i++;
            }

            //To print last row of 2D matrix
            for (int k = 1; k < N; k++) {
                System.out.print(input[i][j] + " ");
                j--;
            }

            //To print first column of 2D matrix
            for (int k = 1; k < N; k++) {
                System.out.print(input[i][j] + " ");
                i--;
            }
            i++;
            j++;
            N -= 2;
        }
        if (N % 2 != 0) {
            System.out.print(input[i][j]);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [][]input = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                input[i][j] = s.nextInt();
            }
        }
        printElementsInSpiralOrder(input);
    }
}
