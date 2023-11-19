package Intermediate1.PrefixSum;

import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        System.out.print(findEquilibriumIndex(input));
    }

    /**
     * method that returns the index at which sum of left equals sum of right elements
     * eg- [-7, 1, 5, 2, -4, 3, 0] index 3 is equilibrium since sum of left and right of index 3 is -1
     *
     * @param input
     * @return equilibrium index of an array
     */
    private static int findEquilibriumIndex(int[] input) {
        int []PS = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            if(i != 0) {
                PS[i] = PS[i-1] + input[i];
            }
            else {
                PS[i] = input[i];
            }
        }
        int leftSum = 0;
        for (int i = 0; i < input.length; i++) {
            if (i != 0) {
                leftSum = PS[i-1];
            }
            if (leftSum == PS[input.length-1] - PS[i]) {
                return i;
            }
        }
        return -1;
    }
}
