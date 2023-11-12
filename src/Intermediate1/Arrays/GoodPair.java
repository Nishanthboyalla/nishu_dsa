package Intermediate1.Arrays;

import java.util.Scanner;

public class GoodPair {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int input[] = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        int k = s.nextInt();
        System.out.print(isGoodPair(input, k));
    }

    /**
     * method used to find whether array has good pair or not
     * Condition: to be good array sum of 2 elements in an array equals k such that i != j
     *
     * @param input - input array
     * @param k - sum of 2 elements
     * @return true or false
     */
    private static boolean isGoodPair(int[] input, int k) {
        int n = input.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (input[i] + input[j] == k) {
                    return true;
                }
            }
        }
        return false;
    }
}
