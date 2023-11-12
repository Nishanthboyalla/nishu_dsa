package Intermediate1.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseInARange {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        int B = s.nextInt();
        int C = s.nextInt();
        reverseInARange(input, B, C);
        for (int i = 0; i < n; i++) {
            System.out.print(input[i] + " ");
        }
    }

    /**
     * method that reverse the elements of an array in a given range
     * ex - given arr[] = [1, 2, 3, 4, 5]
     * range -> [2,4]
     * output - [1, 2, 5, 4, 3]
     *
     * @param input - input array
     * @param b - start index
     * @param c - end index
     */
    private static void reverseInARange(int[] input, int b, int c) {
        int L = b, R = c;
        while (L < R) {
            input[L] += input[R];
            input[R] = input[L] - input[R];
            input[L] = input[L] - input[R];
            L++;
            R--;
        }
    }
}
