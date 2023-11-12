package Intermediate1.Arrays;

import java.util.Scanner;

public class ArrayRotation {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        int B = s.nextInt();
        rotateArray(input, B);
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + " ");
        }
    }

    /**
     * method used to rotate an array B times
     *
     * @param input - input array
     * @param B - rotation number
     */
    private static void rotateArray(int[] input, int B) {
        int n = input.length;
        revArray(input, 0, n-1);
        revArray(input, 0, n-B);
        revArray(input, B, n-1);
    }

    /**
     * method to reverse an array in a given range
     *
     * @param input - array input
     * @param i - start index
     * @param i1 - end index
     */
    private static void revArray(int[] input, int i, int i1) {
        int L = i, R = i1;
        while (L < R) {
            input[L] += input[R];
            input[R] = input[L] - input[R];
            input[L] = input[L] - input[R];
            L++;
            R--;
        }
    }
}
