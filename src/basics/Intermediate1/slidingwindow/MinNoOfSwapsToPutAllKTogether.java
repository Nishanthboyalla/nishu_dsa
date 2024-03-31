package basics.Intermediate1.slidingwindow;

import java.util.Scanner;

public class MinNoOfSwapsToPutAllKTogether {

    /**
     * Method to count min no of swaps to put all elements of value 'k' together
     * @param input - An array
     * @param k - value k
     * @return - min no of swaps
     */
    private static int minNoOfSwapsToPutAllKTogether(int[] input, int k) {
        int totfreq = 0;
        for (int i = 0; i < input.length; i++) {
            totfreq += input[i] == k ? 1 : 0;
        }
        int firstWindow = 0;
        //checking first window for frequency of k
        for (int i = 0; i < totfreq; i++) {
            firstWindow += input[i]==k ? 1 : 0;
        }
        int minSwaps = Integer.MAX_VALUE;
        minSwaps = Math.min(minSwaps, (totfreq - firstWindow));
        //iterating over other windows with the reference of first window
        for (int i = 1; i <= input.length-totfreq; i++) {
            firstWindow = firstWindow + (input[i+totfreq-1]==k?1:0) - (input[i-1]==k?1:0);
            minSwaps = Math.min(minSwaps, (totfreq - firstWindow));
        }
        return minSwaps;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int []input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = s.nextInt();
        }
        int k = s.nextInt();
        System.out.println(minNoOfSwapsToPutAllKTogether(input, k));
    }
}
