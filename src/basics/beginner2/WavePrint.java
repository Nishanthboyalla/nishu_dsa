package basics.beginner2;

import java.util.Scanner;

public class WavePrint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        printWave(arr);
    }

    /**
     * This method is used to print elements of an array in wave format
     * eg- arr=[1 2 3
     *          4 5 6
     *          7 8 9]
     *     output = [ 1 4 7 8 5 2 3 6 9]
     * @param arr - 2D array of int elements of size n*n
     */
    private static void printWave(int[][] arr) {
        int len = arr.length;
        for (int j = 0; j < len; j++) {
            if (j%2 == 0) {
                for (int i = 0; i < len; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else {
                for (int i = len-1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
